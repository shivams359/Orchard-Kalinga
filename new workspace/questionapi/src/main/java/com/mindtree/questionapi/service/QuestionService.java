package com.mindtree.questionapi.service;

import java.util.List;

import com.mindtree.questionapi.entity.Question;

public interface QuestionService {
	
	public  int addQuestion(Question question);
	public List<Question> getQuestion();

}