package com.mindtree.apnadukan.controller;

import javax.enterprise.inject.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mydukancontroller {
	@RequestMapping(value="/mydukan")
	public ModelAndView getdukan()
	{
		String Pagetitle="welcome to my dukan";
		return new ModelAndView("Dukan","productTitle",Pagetitle);
	}
	@RequestMapping(value="/product")
	public String getProductPage(Model model)
	{
		String pageTitle="My product in DUKAN";
		return "Dukan";
		
	}
	

}
