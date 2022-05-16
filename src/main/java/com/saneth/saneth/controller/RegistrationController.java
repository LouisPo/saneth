package com.saneth.saneth.controller;

import com.saneth.saneth.model.RegistrationModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@RestController
public class RegistrationController {
	@PostMapping("/inscription")

	public ModelAndView inscription(Model model) {

		RegistrationModel user = new RegistrationModel();
		model.addAttribute("user", user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("inscription");

		return modelAndView;
	}


}

