package com.mindtree.questionapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.questionapi.entity.Question;
import com.mindtree.questionapi.service.QuestionService;

@RestController
@RequestMapping(value = "/hello")
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	@RequestMapping(value = "/getallquestions", method = RequestMethod.GET)
	public List<Question> listQuestion()  {
		List<Question> listQuestion = questionService.getQuestion();
		System.out.println("hello");
		return listQuestion; 
    }

}
