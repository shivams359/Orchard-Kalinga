package com.mindtree.omsProject.dao.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.omsProject.dao.TrackDao;
import com.mindtree.omsProject.entity.Track;

@Repository
@Transactional
public class TrackDaoImpl implements TrackDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addtrack(Track track) {
		
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(track);
			return true;
		}catch(HibernateException e){
			sessionFactory.openSession().saveOrUpdate(track);
			return true ;
		}
	}

	public List<Track> gettrack() {
		
		List<Track> tracks = new ArrayList<Track>() ;
		try{
				tracks = sessionFactory.getCurrentSession().createQuery("from Track").list() ;
				return tracks ;
			}catch(HibernateException e){
				tracks = sessionFactory.openSession().createQuery("from Track").list() ;
				return tracks ;
			}
	}
}
