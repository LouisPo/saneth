package com.saneth.saneth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScenarioController {
	@GetMapping("/scenario")
	public String scenario() {
		return "Scenario";
	}
}
