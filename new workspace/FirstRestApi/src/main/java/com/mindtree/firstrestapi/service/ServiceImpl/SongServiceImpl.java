package com.mindtree.firstrestapi.service.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.firstrestapi.dao.SongDAO;
import com.mindtree.firstrestapi.entity.Song;
import com.mindtree.firstrestapi.service.SongService;

@Service
public class SongServiceImpl implements SongService {

	@Autowired
	private SongDAO songDAO;
	
	public void setSongDAO(SongDAO songDAO) {
		this.songDAO = songDAO;
	}

	@Override
	@Transactional
	public void addSong(Song song) {
		this.songDAO.addSong(song);
		
	}

	@Override
	@Transactional
	public void deleteSong(int songId) {
		this.songDAO.deleteSong(songId);
		
	}

	@Override
	@Transactional
	public List<Song> getALLSongs() {
		
		return songDAO.getALLSongs();
	}

	@Override
	@Transactional
	public Song getSong(int songId) {
		//System.out.println("service id = "+songId);
		return songDAO.getSong(songId);
	}

	@Override
	@Transactional
	public Song updateSongDetail(Song song) {
		return this.songDAO.updateSongDetail(song);
		
	}
}
