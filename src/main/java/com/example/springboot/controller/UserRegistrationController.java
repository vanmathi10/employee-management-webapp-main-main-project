package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboot.dto.UserRegistrationDto;
import com.example.springboot.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService user_service;

	public UserRegistrationController(UserService user_service) {
		super();
		this.user_service = user_service;
	}
	
	@ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		user_service.save(registrationDto);
		return "redirect:/registration?success";
	}
}
