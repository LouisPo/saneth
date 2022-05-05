package com.saneth.saneth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DesignController {

	@GetMapping("/schema")
	public ModelAndView lore(){


		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("schema");

		return modelAndView;
	}

}
