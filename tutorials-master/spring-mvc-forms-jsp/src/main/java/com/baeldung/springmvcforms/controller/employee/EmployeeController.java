package com.baeldung.springmvcforms.controller.employee;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.baeldung.springmvcforms.domain.Employee;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/employee/initial", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("employeeHome", "employee", new Employee());
    }

    @RequestMapping(value = "/calculateTax", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("employee") final Employee employee, final BindingResult result, final ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", employee.getName());
        model.addAttribute("salary", employee.getSalary());
        model.addAttribute("tax", calculateTax( employee.getSalary()));
        return "employeeView";
    }
    
    private double calculateTax(int salary) {
    	if(salary <= 3000) {
    	//if(salary <= 4000) {
    		return 0D;
    	} else if(salary <= 5500) {
    		return 10D;
    	} else if(salary <= 33500) {
    		return 22D;
    	} else {
    		return 40D;
    	}
    }

}
