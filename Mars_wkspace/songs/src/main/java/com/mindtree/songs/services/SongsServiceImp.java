package com.mindtree.songs.services;

import com.mindtree.songs.dao.SongsDao;
import com.mindtree.songs.dao.DaoImp.SongsDaoImp;
import com.mindtree.songs.entity.SongsData;
import com.mindtree.songs.services.songservice.SongsService;

public class SongsServiceImp implements SongsService{
	public void addsongs(SongsData songs) {
		  SongsDao song=new SongsDaoImp();
		 song.addsongs(songs);
		
	}

}
