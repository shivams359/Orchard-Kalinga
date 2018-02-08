package com.mindtree.songs.dao.DaoImp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.mindtree.songs.dao.SongsDao;
import com.mindtree.songs.entity.SongsData;

public class SongsDaoImp implements SongsDao {
	 

	@Override
	public void addsongs(SongsData songs) {
		 
		SongsData user1=new SongsData();
		SessionFactory sessionfactory = new  Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(songs);
		session.getTransaction().commit();
		session.close();
	}

}
