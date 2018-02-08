package com.mindtree.questionapi.dao;

import java.util.List;

import com.mindtree.questionapi.entity.Question;

public interface QuestionDAO {
	
	public  int addQuestion(Question question);
	public void deleteQuestion(int id);
	public void updateQuestion(Question question);
	public List<Question> getQuestion();

}
