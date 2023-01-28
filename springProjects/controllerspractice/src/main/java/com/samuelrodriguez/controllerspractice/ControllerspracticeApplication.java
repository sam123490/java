package com.samuelrodriguez.controllerspractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ControllerspracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllerspracticeApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "This is working! =)";
	}
	
	@RestController
	@RequestMapping("/hello")
	public class homeController {
		@RequestMapping("")
		public String helloWorld() {
			return "Hello World!";
		}
		@RequestMapping("/sam")
		public String helloSam() {
			return "Hello Sam!";
		}
	}
}