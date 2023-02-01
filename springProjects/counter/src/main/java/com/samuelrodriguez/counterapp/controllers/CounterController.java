package com.samuelrodriguez.counterapp.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	
	@RequestMapping("/my_server/counter")
	public String index(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			Integer count = 0;
			session.setAttribute("count", count);
			model.addAttribute("count", count);
			return "index.jsp";
		}
		return "count.jsp";
	}
	
	@RequestMapping("/my_server")
	public String counter(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			Integer count = 0;
			session.setAttribute("count", count);
			model.addAttribute("count", count);
			return "index.jsp";
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
			model.addAttribute("count", currentCount);
			return "index.jsp";
		}
	}

}