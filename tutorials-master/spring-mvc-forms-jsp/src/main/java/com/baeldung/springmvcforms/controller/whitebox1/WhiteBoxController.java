package com.baeldung.springmvcforms.controller.whitebox1;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.baeldung.springmvcforms.domain.Exam;
import com.baeldung.springmvcforms.domain.WhiteBox;

@Controller
public class WhiteBoxController {

	@RequestMapping(value = "/whiteBox/initial", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("whiteboxHome", "whitebox", new WhiteBox());
	}

	@RequestMapping(value = "/execute", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("whitebox") final WhiteBox whitebox, final BindingResult result,
			final ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		model.addAttribute("x", whitebox.getX());
		model.addAttribute("y", whitebox.getY());
		model.addAttribute("z", whitebox.getZ());
		model.addAttribute("output", execute(whitebox.getX(), whitebox.getY(), whitebox.getZ()));
		return "whiteboxView";
	}

	private String execute(int x, int y, int z) {
		if (x > y) {
			if (x > z) {
				return "Buy";
			} else {
				return "Invalid Flow";
			}
		}
		if (x == y) {
			return "Relax";
		} else if (y > z) {
			return "Hold";

		} else if (y == z) {
			return "Sell";
		} else {
			return "Panic";
		}
	}

}
