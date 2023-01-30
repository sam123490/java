package com.samuelrodriguez.controllers.daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "Welcome! please go to the /daikichi route to continue.";
	}
	
	@RestController
	@RequestMapping("/daikichi")
	public class DaikichiController{
		@RequestMapping("")
		public String home() {
			return "Welcome!";
		}
		
		@RequestMapping("/today")
		public String today() {
			return "Today you will find luck in all your endeavors!";
		}
		
		@RequestMapping("/tomorrow")
		public String tomorrow() {
			return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
		}
		
		@RequestMapping("/travel/{place}")
		public String travel(@PathVariable("place") String place) {
			return "Congratulations! You will soon travel to " + place + "!";
		}
		
		@RequestMapping("/lotto/{num}")
		public String fortune(@PathVariable("num") String num) {
			int number = Integer. parseInt(num);
			if (number % 2 == 0) {
				return "You will take a grand journey in the near future,"
						+ "but be weary of tempting offers";
			}
			else if(number % 2 == 1) {
				return "You have enjoyed the fruits of your labor but now is "
						+ "a great time to spend time with family and friends";
			}
			else {
				return "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
			}
		}
	}
	
}
