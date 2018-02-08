package com.mindtree.easybucks.dao.DaoImp;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.mindtree.easybucks.dao.UserDao;
import com.mindtree.easybucks.entity.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	
	
	private SessionFactory sessionFactory;
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		try{
			return this. getSession();
		}catch(HibernateException e){
			return this.sessionFactory.openSession();
		}
		
	}
	public boolean adduser(User user) {
		
		try{
			getSession().saveOrUpdate(user);
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}


	public List<User> getUser() {
		try{
			String select="from User";
			Query query=getSession().createQuery(select);
			return query.list();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
