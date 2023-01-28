package com.samuelrodriguez.controllers.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}

	@RestController
	public class index{
	
		@RequestMapping("/")
		public String name(@RequestParam(value="fn", required=false) String name,
				@RequestParam(value="ln", required=false) String lastName) {
			if(name==null) {
				return "Hello Human";
			}
			else if(lastName==null) {				
				return "Hello " + name;
			}
			else{
				return "Hello " + name + " " + lastName;
			}
		}
	}
	
}
