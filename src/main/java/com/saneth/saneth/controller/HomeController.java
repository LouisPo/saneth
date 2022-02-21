package com.saneth.saneth.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saneth.saneth.services.HomeService;

@RestController
public class HomeController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
/*	public String home() {
		return "Accueil";
	}*/
	
	public HomeService homeservice(@RequestParam(value = "name", defaultValue = "World")String name) {
		return new HomeService(counter.incrementAndGet(), String.format(template, name));
		
	}
}
