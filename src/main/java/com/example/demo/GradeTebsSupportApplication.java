package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GradeTebsSupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradeTebsSupportApplication.class, args);
		
		System.out.print(" First Boot Application");
	}

	
	@GetMapping("/")
	public String getWelcomeMsg()
	{
		return "Welcome to Spring Boot";
		
	}	
}
