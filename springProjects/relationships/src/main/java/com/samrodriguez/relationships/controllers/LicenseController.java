package com.samrodriguez.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.samrodriguez.relationships.models.License;
import com.samrodriguez.relationships.services.LicenseService;
import com.samrodriguez.relationships.services.PersonService;

@Controller
public class LicenseController {
	@Autowired
	private LicenseService licenseService;
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/licenses/new")
	public String createLicense(@ModelAttribute("license") License license,
			Model model) {
		model.addAttribute("allPersons", personService.getAll());
		return "newLicense.jsp";
	}
	
	@PostMapping("/licenses/new")
	public String saveLicense(@Valid @ModelAttribute("license") License license,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allPersons", personService.getAll());
			return "newLicense.jsp";
		} else {
			licenseService.createOrUpdate(license);
			return "redirect:/persons";
		}
	}
}
