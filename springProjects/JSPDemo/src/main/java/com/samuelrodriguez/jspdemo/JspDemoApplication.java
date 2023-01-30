package com.samuelrodriguez.jspdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class JspDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspDemoApplication.class, args);
	}
	
	@Controller
	public class FruitController{
		@RequestMapping("/")
		public String index(Model model) {
			
			model.addAttribute("fruit", "banana");
			
			return "demo.jsp";
		}
	}
}
