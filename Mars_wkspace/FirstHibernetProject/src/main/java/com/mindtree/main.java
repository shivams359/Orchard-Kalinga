package com.mindtree;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import com.mindtree.FirstHibernetProject.StudentInfo;
public  class main {
	
	public  static  void main(String[] args) 
	{
		StudentInfo Student = new StudentInfo();
		Student.setName("Shivam");
		Student.setRollno(345);
		SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(Student);
		session.getTransaction().commit();
		session.close();
	}
}
