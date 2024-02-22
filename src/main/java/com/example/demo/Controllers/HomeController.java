package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Entities.User;

@Controller
@RequestMapping("/")
public class HomeController {
	@GetMapping("Home")
	public String Home() {
		return "landingPage";
	}
	 @GetMapping("/login")
	    public String loginPage(Model model) {
	        // Add any model attributes needed for the login page
	        model.addAttribute("user", new User()); // Add a User object to bind form data
	        return "login"; // Return the name of the Thymeleaf template for the login page
	    }

}
