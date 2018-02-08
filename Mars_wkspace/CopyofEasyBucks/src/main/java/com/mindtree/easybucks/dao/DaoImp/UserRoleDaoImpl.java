package com.mindtree.easybucks.dao.DaoImp;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mindtree.easybucks.dao.UserRoleDao;
import com.mindtree.easybucks.entity.UserRole;

@Repository
@Transactional
public class UserRoleDaoImpl implements  UserRoleDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean addUserRole(UserRole userRole) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(userRole);
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public List<UserRole> getUserRole() {
		try{
			String select="from UserRole";
			Query query=sessionFactory.getCurrentSession().createQuery(select);
			return ( List<UserRole>) query.list();
		}catch(Exception e){
			e.printStackTrace();
		}	
		return null;
	}

}
