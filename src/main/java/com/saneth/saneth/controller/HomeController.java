package com.saneth.saneth.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saneth.saneth.services.HomeService;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {


	@GetMapping("/index")
	public ModelAndView index(){


		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");

		return modelAndView;
	}


}
