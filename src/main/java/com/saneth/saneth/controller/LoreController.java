package com.saneth.saneth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoreController {
	
	@GetMapping("/lore")
	public String lore() {
		return "Lore";
	}
}
