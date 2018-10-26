package com.baeldung.springmvcforms.controller.decisions.carrentals;

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

@Controller
public class CarRentalsController {

	@RequestMapping(value = "/carRentals/initial", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("carRentalsHome", "carrentals", new CarRentals());
	}

	@RequestMapping(value = "/makeCarRentalsDecision", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("carrentals") final CarRentals carRentals, final BindingResult result,
			final ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		model.addAttribute("name", carRentals.getName());
		model.addAttribute("age", carRentals.getAge());
		model.addAttribute("cleandrivingrecord", carRentals.isCleandrivingrecord());
		model.addAttribute("onbusiness", carRentals.isOnbusiness());
		model.addAttribute("supplyrentalcar", isSupplyRentalCar(carRentals));
		model.addAttribute("premiumcharge", isPremiumCharge(carRentals));

		return "carRentalsView";
	}

	private boolean isSupplyRentalCar(CarRentals carRental) {

		// Rule 1
		if (carRental.getAge() <= 23) {
			return false;
		}

		// Rule 2
		if (carRental.getAge() > 23 && !carRental.isCleandrivingrecord()) {
			return false;
		}

		// Rule 3
		if (carRental.getAge() > 23 && carRental.isCleandrivingrecord() && !carRental.isOnbusiness()) {
			return true;
		}

		// Rule 4
		if (carRental.getAge() > 23 && carRental.isCleandrivingrecord() && carRental.isOnbusiness()) {
			return true;
		}

		// Invalid No Rule Picked up
		return true;
	}

	private boolean isPremiumCharge(CarRentals carRental) {

		// Rule 1
		if (carRental.getAge() <= 23) {
			return false;
		}

		// Rule 2
		if (carRental.getAge() > 23 && !carRental.isCleandrivingrecord()) {
			return false;
		}

		// Rule 3
		if (carRental.getAge() > 23 && carRental.isCleandrivingrecord() && !carRental.isOnbusiness()) {
			return false;
		}

		// Rule 4
		if (carRental.getAge() > 23 && carRental.isCleandrivingrecord() && carRental.isOnbusiness()) {
			return true;
		}

		// Invalid No Rule Picked up
		return true;

	}

}
