package com.baeldung.springmvcforms.controller.decisions.insurance;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.baeldung.springmvcforms.domain.CarRentals;
import com.baeldung.springmvcforms.domain.DecisionTable;
import com.baeldung.springmvcforms.domain.Exam;
import com.baeldung.springmvcforms.domain.Insurance;

@Controller
public class InsuranceController {

	@RequestMapping(value = "/insurance/initial", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("insuranceHome", "insurance", new Insurance());
	}

	@RequestMapping(value = "/makeInsuranceDecision", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("insurance") final Insurance insurance, final BindingResult result,
			final ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		model.addAttribute("name", insurance.getName());
		model.addAttribute("existingMedicalCondition", insurance.isExistingMedicalCondition());
		model.addAttribute("smoker", insurance.isSmoker());
		model.addAttribute("skiing", insurance.isSkiing());
		model.addAttribute("insureperson", isInsure(insurance));
		model.addAttribute("offerDiscount", isInsure(insurance));

		return "insuranceView";
	}

	private boolean isInsure(Insurance insurance) {
		// Rule 1
		if (insurance.isExistingMedicalCondition()) {
			return false;
		}

		// Rule 2
		if (!insurance.isExistingMedicalCondition() && insurance.isSmoker()) {
			return true;
		}

		// Rule 3
		if (!insurance.isExistingMedicalCondition() && !insurance.isSmoker()) {
			return true;
		}

		// Rule 4
		if (!insurance.isExistingMedicalCondition() && !insurance.isSmoker()) {
			return true;
		}

		return false;
	}

	private String offerDiscount(Insurance insurance) {
		// Rule 1
		if (insurance.isExistingMedicalCondition()) {
			return "Not Applicable";
		}

		// Rule 2
		if (!insurance.isExistingMedicalCondition() && insurance.isSmoker()) {
			return "No";
		}

		// Rule 3
		if (!insurance.isExistingMedicalCondition() && !insurance.isSmoker()) {
			return "15%";
		}

		// Rule 4
		if (!insurance.isExistingMedicalCondition() && !insurance.isSmoker()) {
			return "10%";
		}

		return "Invalid Offer";
	}

}
