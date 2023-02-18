package com.samrodriguez.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.samrodriguez.relationships.models.Person;
import com.samrodriguez.relationships.services.PersonService;

@Controller
public class PersonController {
	@Autowired
	private PersonService service;
	
	@GetMapping("/")
	public String redirect() {
		return "redirect:/persons";
	}
	
	@GetMapping("/persons")
	public String index(Model model) {
		model.addAttribute("allPersons", service.getAll());
		return "index.jsp";
	}
	
	@GetMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		
		return "newPerson.jsp";
	}
	
	@PostMapping("/persons/new")
	public String savePerson(
			@Valid @ModelAttribute("person") Person person,
			BindingResult result) {
		if(result.hasErrors()) {
			return "newPerson.jsp";
		} else {
			service.createOrUpdate(person);
			return "redirect:/persons";
		}
	}
	
	@GetMapping("/persons/{id}")
	public String showPerson(
			@PathVariable("id") Long id,
			Model model) {
		model.addAttribute("person", service.getOne(id));
		return "showPerson.jsp";
	}
}
