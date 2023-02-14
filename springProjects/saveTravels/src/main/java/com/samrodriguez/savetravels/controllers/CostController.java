package com.samrodriguez.savetravels.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.samrodriguez.savetravels.models.Cost;
import com.samrodriguez.savetravels.services.CostService;

@Controller
public class CostController {
	private final CostService costService;
	
	public CostController(CostService costService) {
		this.costService = costService;
	}
	
	@GetMapping("/")
	public String redirect() {
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String home(@ModelAttribute("cost") Cost cost, Model model) {
		model.addAttribute("allCosts", costService.allCosts());
		return "home.jsp";
	}
	
	@PostMapping("/expenses")
	public String addCost(@Valid @ModelAttribute("cost") Cost cost, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allCosts", costService.allCosts());
			return "home.jsp";
		}else {
			costService.createAndUpdateCost(cost);
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/expenses/{id}")
	public String editCost(@PathVariable("id") Long id, @ModelAttribute("cost") Cost cost, Model model) {
		model.addAttribute("cost", costService.findCost(id));
		return "edit.jsp";
	}
	
	@PutMapping("/expenses/{id}")
	public String saveCostEdit(@Valid @ModelAttribute("cost") Cost cost, BindingResult result, @PathVariable("id") Long id, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("cost", cost);
			return "edit.jsp";
		}else {
			costService.createAndUpdateCost(cost);
			return "redirect:/expenses";
		}
	}
	
	@DeleteMapping("/expenses/{id}/delete")
	public String deleteCost(@PathVariable("id") Long id) {
		costService.deleteCost(id);
		return "redirect:/expenses";
	}

}
