package com.saneth.saneth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RegistrationController {
	@GetMapping("/inscription")

	public ModelAndView inscription() {


		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("inscription");

		return modelAndView;
	}


}