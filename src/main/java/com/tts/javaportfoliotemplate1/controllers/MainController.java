package com.tts.javaportfoliotemplate1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String homePage() {
		return "index";
	}
	
	@GetMapping("/projects")
	public String projectsPage() {
		return "projects";
	}
	
	@GetMapping("/contact")
	public String contactPage() {
		return "contact";
	}

	@PostMapping("/thankyou")
	public String thankYouPage() {
		
		return "thankyou";
	}

	
}
