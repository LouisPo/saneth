package com.saneth.saneth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
	@GetMapping("/inscription")
	public String registration() {
		return "Inscription";
	}
	

}
