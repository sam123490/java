package com.samrodriguez.bookclub.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.samrodriguez.bookclub.services.BookService;
import com.samrodriguez.bookclub.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/dashboard")
	public String dashboard(
			Model model,
			HttpSession session
			) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("loggedUser", userService.getOne((Long) session.getAttribute("userId")));
		model.addAttribute("allBooks", bookService.getAll());
//		model.addAttribute("borrowedBooks", bookService.getAllBorrowed( (Long) session.getAttribute("userId")));
		model.addAttribute("borrowedBooks", bookService.getAllBorrowed(userService.getOne( (Long) session.getAttribute("userId"))));
		return "dashboard.jsp";
	}
}
