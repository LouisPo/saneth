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

//version permettant de rechercher une news avec son nom
//	List<NewsModel> l = service.getbyTitle("");
	//List<NewsModel> l = service.getbyText("");
	//List<NewsModel> l =service.getbyDate(new Date());
	
	//creer la list
	List<NewsModel> l = service.getAllNews();
	//creer le contenu de la list
	List<String> send = new ArrayList<>();
	List<String> send2= new ArrayList<>();
	List<String> send3= new ArrayList<>();

	//pour chaque news, prend les valeurs de toutes les infos puis sont rentrer dans a, l servant d'indicateur pour le nombre d'info
	for (int i = 1; i <= 2; i++){
		//on rentre les infos dans send
		send.add(l.get(i).getTitle());
		send2.add(l.get(i).getText());
		send3.add(l.get(i).getDate().toString());

	}


	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("news");
	modelAndView.addObject("message",send);
	modelAndView.addObject("message2",send2);
	modelAndView.addObject("message3",send3);

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
