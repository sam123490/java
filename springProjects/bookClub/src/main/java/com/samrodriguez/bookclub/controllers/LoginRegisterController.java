package com.samrodriguez.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.samrodriguez.bookclub.models.LoginUser;
import com.samrodriguez.bookclub.models.User;
import com.samrodriguez.bookclub.services.UserService;

@Controller
public class LoginRegisterController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index(
			@ModelAttribute("newUser") User newUser,
			@ModelAttribute("newLogin") LoginUser newLogin
			) {
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public String register(
			@Valid @ModelAttribute("newUser") User NewUser,
			BindingResult result,
			Model model,
			HttpSession session
			) {
		User u = userService.register(NewUser, result);
		if (u == null) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		} else {
			session.setAttribute("userId", u.getId());
			return "redirect:/dashboard";
		}
	}
	
	@PostMapping("/login")
	public String login(
			@Valid @ModelAttribute("newLogin") LoginUser newLogin,
			BindingResult result,
			Model model,
			HttpSession session
			) {
		User u = userService.login(newLogin, result);
		if (u == null) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		} else {
			session.setAttribute("userId", u.getId());
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		session.removeAttribute("userId");
		return "redirect:/";
	}

}
