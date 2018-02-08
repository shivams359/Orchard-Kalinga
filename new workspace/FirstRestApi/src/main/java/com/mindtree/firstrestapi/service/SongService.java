package com.mindtree.firstrestapi.service;

import java.util.List;

import com.mindtree.firstrestapi.entity.Song;

public interface SongService {
	
	
	void addSong(Song song);
	
	
	void deleteSong(int songId);
	 
	
	List<Song> getALLSongs();
	
	
	Song getSong(int songId);
	
	
	Song updateSongDetail(Song song);
	

}
