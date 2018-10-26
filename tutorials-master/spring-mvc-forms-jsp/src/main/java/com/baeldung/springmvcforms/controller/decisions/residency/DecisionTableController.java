package com.baeldung.springmvcforms.controller.decisions.residency;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.baeldung.springmvcforms.domain.DecisionTable;
import com.baeldung.springmvcforms.domain.Exam;

@Controller
public class DecisionTableController {

    @RequestMapping(value = "/decisionTable/initial", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("decisionTableHome", "decisionTable", new DecisionTable());
    }

    @RequestMapping(value = "/makeDecision", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("decisionTable") final DecisionTable decisionTable, final BindingResult result, final ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", decisionTable.getName());
        model.addAttribute("indianResident", decisionTable.isIndianResident());
        model.addAttribute("married", decisionTable.isMarried());
        model.addAttribute("age", decisionTable.getAge());
        model.addAttribute("issueMemberShip", issueMemberShip(decisionTable)); 
        model.addAttribute("offer10PercentDiscount", issue10PercentDiscount(decisionTable)); 
        return "decisionTableView";
    }
    
    private boolean issueMemberShip(DecisionTable decisionTable) {
    	//Rule1
    	if(!decisionTable.isIndianResident()) { 
    		return false;
    	}
    	
    	//Rule2
    	if(decisionTable.isIndianResident() && !(decisionTable.getAge() <18 || decisionTable.getAge() >55)) {
    	//if(decisionTable.isIndianResident() && !(decisionTable.getAge() >=18 && decisionTable.getAge() <=55) ){
    		return false;
    	}
    	
    	//Rule3
    	if(decisionTable.isIndianResident() && (decisionTable.getAge() >=18 && decisionTable.getAge() <=55) && !decisionTable.isMarried()){
    		return true;
    	}
    	
    	//Rule 4
    	if(decisionTable.isIndianResident() && (decisionTable.getAge() >=18 && decisionTable.getAge() <=55) && decisionTable.isMarried()){
    		return true;
    	}
    	
    	//None of the Rule Matched
    	return false;
    	
    }
    
    private boolean issue10PercentDiscount(DecisionTable decisionTable) {
    	//Rule1
    	if(!decisionTable.isIndianResident()) { 
    		return false;
    	}
    	
    	//Rule2
    	if(decisionTable.isIndianResident() && !(decisionTable.getAge() <18 || decisionTable.getAge() >55)) {
    	//if(decisionTable.isIndianResident() && !(decisionTable.getAge() >=18 && decisionTable.getAge() <=55) ){
    		return false;
    	}
    	
    	//Rule3
    	if(decisionTable.isIndianResident() && (decisionTable.getAge() >=18 && decisionTable.getAge() <=55) && !decisionTable.isMarried()){
    		return true;
    	}
    	
    	//Rule 4
    	if(decisionTable.isIndianResident() && (decisionTable.getAge() >=18 && decisionTable.getAge() <=55) && decisionTable.isMarried()){
    		return false;
    	}
    	
    	//None of the Rule Matched
    	return false;
    }

}
