package com.samuelrodriguez.displaydate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Date {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
}
