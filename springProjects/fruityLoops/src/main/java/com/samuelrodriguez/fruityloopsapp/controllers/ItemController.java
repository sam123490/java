package com.samuelrodriguez.fruityloopsapp.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samuelrodriguez.fruityloopsapp.models.Item;

@Controller
public class ItemController {
	
	@RequestMapping("/")
	public String index(Model model) {
		
		ArrayList<Item> fruits = new ArrayList<Item>();
		fruits.add(new Item("Kiwi", 1.5));
		fruits.add(new Item("Mango", 2.0));
		fruits.add(new Item("Goji Berries", 4.0));
		fruits.add(new Item("Guava", 0.75));
		fruits.add(new Item("Apple", 1.0));
		fruits.add(new Item("Dragon Fruit", 4.5));
		
		model.addAttribute("fruits", fruits);
	
		return "index.jsp";
		
	}
}
