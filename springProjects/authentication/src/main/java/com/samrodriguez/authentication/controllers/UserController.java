package com.samrodriguez.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.samrodriguez.authentication.models.LoginUser;
import com.samrodriguez.authentication.models.User;
import com.samrodriguez.authentication.services.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String LoginAndRegister(
			@ModelAttribute("newUser") User newUser,
			@ModelAttribute("newLogin") LoginUser loginUser) {
		return "login-register.jsp";
	}
	
	@PostMapping("/register")
	public String register(
			@Valid @ModelAttribute("newUser") User newUser,
			BindingResult result,
			Model model,
			HttpSession session) {
		User u = userService.register(newUser, result);
		if(u == null) {
			model.addAttribute("newLogin", new LoginUser());
			return "login-register.jsp";
		} else {
			session.setAttribute("userId", u.getId());
			return "redirect:/home";			
		}
	}
	
	@PostMapping("/login")
	public String Login(
			@Valid @ModelAttribute("newLogin") LoginUser newLogin,
			BindingResult result,
			Model model,
			HttpSession session) {
		User u = userService.login(newLogin, result);
		if(u == null) {
			model.addAttribute("newUser", new User());
			return "login-register.jsp";
		} else {
			session.setAttribute("userId", u.getId());
			return "redirect:/home";			
		}
	}
	
	@GetMapping("/home")
	public String home(
			HttpSession session,
			Model model) {
		if (session.getAttribute("userId") == null){
			return "redirect:/";
		} else {
			model.addAttribute("loggedUser", userService.getOne((Long) session.getAttribute("userId")));
			return "home.jsp";			
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("userId");
		return "redirect:/";
	}
}
