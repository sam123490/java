package com.samrodriguez.burgertracker.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samrodriguez.burgertracker.models.Burger;
import com.samrodriguez.burgertracker.services.BurgerService;

@Controller
public class BurgerController {
	private final BurgerService burgerService;
	
	public BurgerController(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
	
	@GetMapping("/")
	public String ok() {
		return "redirect:/burgers";
	}
	
	@GetMapping("/burgers")
	public String index(@ModelAttribute("burger") Burger burger, Model model) {
		List<Burger> burgers = burgerService.allBurgers();
		model.addAttribute("allBurgers", burgers);
		return "index.jsp";
	}
	
	@PostMapping("/burgers/save")
	public String saveBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Burger> burgers = burgerService.allBurgers();
			model.addAttribute("allBurgers", burgers);
			return "index.jsp";
		} else {			
			burgerService.createBurger(burger);
			return "redirect:/burgers";
		}
	}
}
