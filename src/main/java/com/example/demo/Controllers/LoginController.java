package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entities.User;
import com.example.demo.Repositories.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

	 @Autowired
	    private UserRepository userRepository;
	 

	    @PostMapping("/login")
	    public String login(@RequestParam String email, @RequestParam String password, HttpSession session,Model model) {
	        // Custom authentication logic
	    	
	        User user = userRepository.findByEmailId(email);
	  
	        if (user != null && user.getPassword().equals(password)) {
	            // Set user data in session
	        	System.out.println(user.getFirstName());
	            session.setAttribute("email", user.getEmailid());
	            session.setAttribute("username", user.getFirstName());
	            return "landingPage";
	        } else {
	        	model.addAttribute("message","invalid credentials");
	            return"login";
	        }
	    }

	    @GetMapping("/logout")
	    public String logout(HttpSession session) {
	        // Invalidate session
	        session.invalidate();
	        return "login";
	    }
}
