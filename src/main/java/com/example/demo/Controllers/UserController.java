package com.example.demo.Controllers;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Entities.User;
import com.example.demo.Repositories.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository; // Assuming UserRepository is your repository interface
    @GetMapping("register")
    public String registerPage(Model model) {
    	model.addAttribute("user", new User());
    	return "registerUser";
    }
    @PostMapping("/saveUser")
    // Method to register a new user
    public String registerUser(User user, BindingResult bindingResult) {
        // Validate form inputs
        if (!isValidName(user.getFirstName())) {
            bindingResult.addError(new FieldError("user", "firstName", "First name cannot contain numbers"));
        }
        
        if (!isValidName(user.getLastName())) {
            bindingResult.addError(new FieldError("user", "lastName", "Last name cannot contain numbers"));
        }

        if (!user.getPassword().equals(user.getConfirmPassword())) {
            bindingResult.addError(new FieldError("user", "confirmPassword", "Passwords do not match"));
        }

        if (bindingResult.hasErrors()) {
            return "registerUser"; // Return to the registration form with error messages
        }

        // Generate user ID
        String userId = getNextUserId();
        user.setUserId(userId);

        // Assign role
        user.setRole("user");

        // Save the user using the repository
        userRepository.save(user);

        return "registerUser";
    }

    // Method to get the next available user ID
    private String getNextUserId() {
        Integer lastUserId = userRepository.getLastUserId();
        
        if (lastUserId == null) {
            // No users exist, start from 1
            return generateUserId(0);
        }
        
        // Increment the last user ID to get the next user ID
        return generateUserId(lastUserId + 1);
    }

    // Method to generate user ID based on the year and a number
    private String generateUserId(int number) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear + String.format("%03d", number); // Assuming user ID format is YYYY000, YYYY001, etc.
    }

    // Method to validate if a name contains only alphabetic characters
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }

	
}
