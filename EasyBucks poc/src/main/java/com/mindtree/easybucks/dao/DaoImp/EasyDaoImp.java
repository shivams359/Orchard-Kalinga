package com.mindtree.easybucks.dao.DaoImp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mindtree.easybucks.dao.EasyDao;
import com.mindtree.easybucks.entity.UserData;

public class EasyDaoImp implements EasyDao {

	public void adduser(UserData user) {
	
		SessionFactory sessionfactory = new  Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(user);
		session.getTransaction().commit();
		session.close();
		
	}

}
