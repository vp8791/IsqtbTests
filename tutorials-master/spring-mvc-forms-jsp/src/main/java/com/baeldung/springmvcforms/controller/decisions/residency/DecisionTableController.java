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
        model.addAttribute("issueMemberShip", DecisionControlUtils.issueMemberShip(decisionTable)); 
       model.addAttribute("offer10PercentDiscount", DecisionControlUtils.offer10PercentDiscount(decisionTable)); 
        return "decisionTableView";
    }
    
   
   

}
