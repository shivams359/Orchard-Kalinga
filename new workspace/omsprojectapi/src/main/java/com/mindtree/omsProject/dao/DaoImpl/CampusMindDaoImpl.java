package com.mindtree.omsProject.dao.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.omsProject.dao.CampusMindDao;
import com.mindtree.omsProject.entity.CampusMind;

@Repository
public class CampusMindDaoImpl implements CampusMindDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public boolean addcampusmind(CampusMind campusMind) {
		
			System.out.println(campusMind.getMid());
			sessionFactory.openSession().save(campusMind);
			System.out.println("data inserted");
			return true;
	}
	
	@Transactional
	public List<CampusMind> getcampusmind() {
	
		List<CampusMind> campusminds = new ArrayList<CampusMind>() ;
		try{
				campusminds = sessionFactory.getCurrentSession().createQuery("from CampusMind").list() ;
				return campusminds ;
			}catch(HibernateException e){
				campusminds = sessionFactory.openSession().createQuery("from CampusMind").list() ;
				return campusminds ;
			}
	}
}
