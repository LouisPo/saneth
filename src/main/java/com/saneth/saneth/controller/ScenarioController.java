package com.saneth.saneth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ScenarioController {
	@GetMapping("/scenario")

	public ModelAndView scenario() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("scenario");

		return modelAndView;

	}


}