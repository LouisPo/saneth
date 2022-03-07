package com.saneth.saneth.controller;

import com.saneth.saneth.model.NewsModel;
import com.saneth.saneth.repositories.NewsRepositorie;
import com.saneth.saneth.services.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Controller
public class NewsController {


private final NewsService service;

@GetMapping("/pat")

//for each pour decomposer les infos, prendre le titre, le texte et la date
public ModelAndView news() {
	List<NewsModel> l = service.getAllNews();
	List<String> send = new ArrayList<>();
	for (NewsModel a : l){
		send.add(a.toString());

	}
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("news");
	modelAndView.addObject("message",send);

		return modelAndView;

		}




@GetMapping("/news/title/{title}")
public List<NewsModel> newsbytitle(@PathVariable String title){
		return service.getbyTitle(title);
		}

@GetMapping("/essai")
public ModelAndView newsPage(Model model) {
		ModelAndView mav = new ModelAndView("news");
		mav.addObject("project",  service.getbyTitle("title"));
		return mav;
		}


@GetMapping("/news/id/{id}")
public NewsModel newsbyid(@PathVariable Integer id){ return service.getbyId(id);}

@GetMapping("/news/text/{text}")
public List<NewsModel> newsbytext(@PathVariable String text){ return service.getbyText(text);}


@GetMapping("/news/date/{date}")
public List<NewsModel> newsbydate(@PathVariable Date date){ return service.getbyDate(date);}





		}
