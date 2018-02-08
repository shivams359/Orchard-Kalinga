package com.mindtree.questionapi.service.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.questionapi.dao.QuestionDAO;
import com.mindtree.questionapi.entity.Question;
import com.mindtree.questionapi.service.QuestionService;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionDAO questionDAO;
	
	public int addQuestion(Question question) {
		 
		questionDAO.addQuestion(question);
		return 0;
	}

	public List<Question> getQuestion() {
		
		return questionDAO.getQuestion();
	}

}
