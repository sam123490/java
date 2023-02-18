package com.samrodriguez.dojosAndNinjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.samrodriguez.dojosAndNinjas.models.Ninja;
import com.samrodriguez.dojosAndNinjas.services.DojoService;
import com.samrodriguez.dojosAndNinjas.services.NinjaService;

@Controller
public class NinjaController {
	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/ninjas/create")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja,
			Model model) {
		model.addAttribute("allDojos", dojoService.getAll());
		return "create-ninja.jsp";
	}
	
	@PostMapping("/ninjas/create")
	public String saveNinja(@Valid @ModelAttribute("ninja") Ninja ninja,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allDojos", dojoService.getAll());
			return "create-ninja.jsp";
		} else {
			ninjaService.createOrUpdate(ninja);
			return "redirect:/dojos";
		}
	}

}
