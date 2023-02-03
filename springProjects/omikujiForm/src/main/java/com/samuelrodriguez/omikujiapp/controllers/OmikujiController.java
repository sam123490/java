package com.samuelrodriguez.omikujiapp.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {

	@RequestMapping("/omikuji")
	public String omikujiForm() {
		
		return "form.jsp";
	}
	
	@PostMapping("omikuji/process")
	public String process(
			HttpSession session,
			@RequestParam(value="num") int num,
			@RequestParam(value="city") String city,
			@RequestParam(value="name") String name,
			@RequestParam(value="profession") String profession,
			@RequestParam(value="animal") String animal,
			@RequestParam(value="message") String message) {
		
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("profession", profession);
		session.setAttribute("animal", animal);
		session.setAttribute("message", message);
		
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("omikuji/show")
	public String results() {
		
		return "results.jsp";
	}
}
