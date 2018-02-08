package com.mindtree.questionapi.dao.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.questionapi.dao.QuestionDAO;
import com.mindtree.questionapi.entity.Question;

@Repository
@Transactional
public class QuestionDAOImpl implements QuestionDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public int addQuestion(Question question) {
//		try{
//			sessionFactory.getCurrentSession().saveOrUpdate(question);
//		}catch(HibernateException e){
//			sessionFactory.openSession().saveOrUpdate(question);
//		}
//		finally{
//			sessionFactory.close();
//		}

		return 0;
	}

	public void deleteQuestion(int id) {
		
		
	}

	public void updateQuestion(Question question) {
		
		
	}

	public List<Question> getQuestion() {
		
		List<Question> questions = new ArrayList<Question>() ;
		try{
				questions = sessionFactory.getCurrentSession().createQuery("from Question").list() ;
				return questions ;
			}catch(HibernateException e){
				questions = sessionFactory.openSession().createQuery("from Question").list() ;
				return questions ;
			}
			finally
			{
				sessionFactory.close();
			}
	}
}
