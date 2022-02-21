package com.saneth.saneth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomelogController {
	
	@GetMapping("/AccueilLog")
	public String homelog() {
		return "Accueil Log";
	}

}
