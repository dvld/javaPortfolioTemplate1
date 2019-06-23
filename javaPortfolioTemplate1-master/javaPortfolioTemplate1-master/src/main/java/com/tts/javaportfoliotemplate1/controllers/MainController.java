package com.tts.javaportfoliotemplate1.controllers;

import com.tts.javaportfoliotemplate1.models.Contact;
import com.tts.javaportfoliotemplate1.services.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
  
  @Autowired
  private ContactService contactService;

	@GetMapping("/")
	public String homePage() {
		return "index";
	}
	
	@GetMapping("/projects")
	public String projectsPage() {
		return "projects";
	}
	
	@GetMapping("/contact")
	public String contactPage(Contact contact) {
  
		return "contact";
	}

	@PostMapping("/thankyou")
	public String thankYouPage(Contact contact, Model model) {
    contactService.save(contact);
    model.addAttribute("firstName", contact.getFirstName());
    model.addAttribute("lastName", contact.getLastName());
    model.addAttribute("message", contact.getMessage());
    model.addAttribute("reason", contact.getReason());
    model.addAttribute("email", contact.getEmail());
		return "thankyou";
	}

}
