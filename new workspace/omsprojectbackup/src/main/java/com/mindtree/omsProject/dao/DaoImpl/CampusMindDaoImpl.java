package com.mindtree.omsProject.dao.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.omsProject.dao.CampusMindDao;
import com.mindtree.omsProject.entity.CampusMind;

@Repository
@Transactional
public class CampusMindDaoImpl implements CampusMindDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addcampusmind(CampusMind campusMind) {
		
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(campusMind);
			return true;
		}catch(HibernateException e){
			sessionFactory.openSession().saveOrUpdate(campusMind);
			return true ;
		}
//		finally{
//			sessionFactory.close();
//		}
	}

	public List<CampusMind> getcampusmind() {
	
		List<CampusMind> campusminds = new ArrayList<CampusMind>() ;
		try{
				campusminds = sessionFactory.getCurrentSession().createQuery("from CampusMind").list() ;
				return campusminds ;
			}catch(HibernateException e){
				campusminds = sessionFactory.openSession().createQuery("from CampusMind").list() ;
				return campusminds ;
			}
//			finally
//			{
//				sessionFactory.close();
//			}
	}

}
