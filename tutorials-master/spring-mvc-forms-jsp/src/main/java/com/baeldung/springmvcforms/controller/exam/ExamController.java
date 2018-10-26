package com.baeldung.springmvcforms.controller.exam;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.baeldung.springmvcforms.domain.Exam;

@Controller
public class ExamController {

    @RequestMapping(value = "/exams/initial", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("examHome", "exam", new Exam());
    }

    @RequestMapping(value = "/calculateResult", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("exam") final Exam exam, final BindingResult result, final ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", exam.getName());
        model.addAttribute("examMarks", exam.getExamMarks());
        model.addAttribute("result", calculateResult(exam.getExamMarks()));
        return "examView";
    }
    
    private String calculateResult(int marks) {
    	if( marks <= 39) {
    	//if( marks <= 39) {
    		return "Fail";
    		//return "Pass";
    	} else if(marks <= 59) {
    		//return "Fail";
    		return "Pass";
    	} else if(marks <= 79) {
    		return "Merit";
    	} else if(marks <= 100) {
    		return "Distinction";
    	} else {
    		return "Invalid Marks";
    	}
    }

}
