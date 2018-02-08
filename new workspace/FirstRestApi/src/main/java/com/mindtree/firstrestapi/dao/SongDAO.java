package com.mindtree.firstrestapi.dao;

import java.util.List;

import com.mindtree.firstrestapi.entity.Song;

public interface SongDAO {
	
	void addSong(Song song);
	
	void deleteSong(int songId);
	 
	List<Song> getALLSongs();
	
	Song getSong(int songId);
	
	Song updateSongDetail(Song song);

}
