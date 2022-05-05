package com.saneth.saneth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class LoreController {
	
	@GetMapping("/lore")
	public ModelAndView lore(){


		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("lore");

		return modelAndView;
	}
}
