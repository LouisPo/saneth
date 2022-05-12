package com.saneth.saneth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

	@GetMapping("/connexion")
	public ModelAndView login() {


		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("connexion");

		return modelAndView;

	}
}
