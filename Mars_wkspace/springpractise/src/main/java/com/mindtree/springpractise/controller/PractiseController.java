package com.mindtree.springpractise.controller;


import javax.enterprise.inject.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PractiseController {
	@RequestMapping(value="/vishal")
	public  ModelAndView printname(Model model)
	{
		String name="vishal";
		
		return new ModelAndView("rayan","manoj",name);
		
	}
	
	
	
}