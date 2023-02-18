package com.samrodriguez.dojosAndNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.samrodriguez.dojosAndNinjas.models.Dojo;
import com.samrodriguez.dojosAndNinjas.models.Ninja;
import com.samrodriguez.dojosAndNinjas.services.DojoService;
import com.samrodriguez.dojosAndNinjas.services.NinjaService;

@Controller
public class DojoController {
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/")
	public String redirect() {
		return "redirect:/dojos";
	}
	
	@GetMapping("/dojos")
	public String index(Model model) {
		model.addAttribute("allDojos", dojoService.getAll());
		return "index.jsp";
	}
	
	@GetMapping("/dojos/create")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "create-dojo.jsp";
	}
	
	@PostMapping("/dojos/create")
	public String saveDojo(@Valid @ModelAttribute("dojo") Dojo dojo,
			BindingResult result) {
		if(result.hasErrors()) {
			return "create-dojo.jsp";
		} else {
			dojoService.createOrUpdate(dojo);
			return "redirect:/dojos";
		}
	}
	
	@GetMapping("/dojos/{dojo_id}")
	public String showDojo(@PathVariable("dojo_id") Long dojo_id, 
			Model model) {
		model.addAttribute("dojo", dojoService.getOne(dojo_id));
		return "show-dojo.jsp";
	}

}
