package com.saneth.saneth.controller;

import com.saneth.saneth.model.RegistrationModel;
import com.saneth.saneth.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;


/*
@RestController
public class RegistrationController {
	@GetMapping("/inscription")

	public ModelAndView inscription(Model model) {

		RegistrationModel user = new RegistrationModel();
		model.addAttribute("user", user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("inscription");

		return modelAndView;
	}

	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user") User user) {
		System.out.println(user);
		return "register_success";
	}
}

*/


@Controller
public class RegistrationController {



	@GetMapping("/inscription")
	public String inscription(Model model) {
		model.addAttribute("user", new RegistrationModel());


		return "inscription";
	}

	@PostMapping("/inscription")
	public String submissionResult(@ModelAttribute("user") RegistrationModel person) {
		return "result";
	}

}