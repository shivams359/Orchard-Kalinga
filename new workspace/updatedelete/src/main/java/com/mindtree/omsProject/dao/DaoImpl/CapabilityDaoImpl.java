package com.mindtree.omsProject.dao.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.omsProject.dao.CapabilityDao;
import com.mindtree.omsProject.entity.Capability;

@Repository
@Transactional
public class CapabilityDaoImpl implements CapabilityDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addcapability(Capability capability) {
		
		try{
			sessionFactory.openSession().saveOrUpdate(capability);
			return true;
		}catch(HibernateException e){
			//sessionFactory.openSession().saveOrUpdate(capability);
			return false ;
		}
	}

	public List<Capability> getcapability() {
		
		List<Capability> capabilities = new ArrayList<Capability>() ;
		try{
				capabilities = sessionFactory.getCurrentSession().createQuery("from Capability").list() ;
				return capabilities ;
			}catch(HibernateException e){
				capabilities = sessionFactory.openSession().createQuery("from Capability").list() ;
				return capabilities ;
			}

	}

}
