package com.mindtree.firstrestapi.dao.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mindtree.firstrestapi.dao.SongDAO;
import com.mindtree.firstrestapi.entity.Song;

@Repository
public class SongDAOImpl implements SongDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(SongDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public void addSong(Song song) {
		getSession().persist(song);
		logger.info("Song is added successfully");
	}

	@Override
	public void deleteSong(int songId) {
		Song song = getSession().load(Song.class, new Integer(songId));
		if(null!=song) {
			getSession().delete(song);
			logger.info("Song is deleted successfully");
		} else {
			logger.info("Unable to delete the song");
		}
	}
	
	@SuppressWarnings ("unchecked")
	@Override
	public List<Song> getALLSongs() {
		List<Song> songs = getSession().createQuery("from Song").list();
		if(null != songs) {
			logger.info("Fetched all songs successfully");
		}else {
			logger.info("Unable to fetch all songs");
		}
		System.out.println("songs =" +songs.size());
		return songs;
	}

	@Override
	public Song getSong(int songId) {
		System.out.println("song iddd = "+songId);
		//return getSession().load(Song.class, new Integer(songId));
		Song s = getSession().load(Song.class, new Integer(songId));
		System.out.println("id = "+s.getId()+"name = "+s.getName());
		System.out.println("song detail = "+getSession().load(Song.class, new Integer(songId)));
		return getSession().load(Song.class, new Integer(songId));
	}

	@Override
	public Song updateSongDetail(Song song) {

		Song song1 = null;
		
		if(null!=song) {
			System.out.println("song is fetched");
			getSession().update(song);
//			getSession().saveOrUpdate(song);
		} else{
			System.out.println("Wrong id of song");
		}
		song1 = getSession().load(Song.class, new Integer(song.getId()));
		return song1;
		
	}
	}


