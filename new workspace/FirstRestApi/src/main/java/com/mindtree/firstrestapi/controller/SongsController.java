package com.mindtree.firstrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.firstrestapi.entity.Song;
import com.mindtree.firstrestapi.service.SongService;

@RestController
@RequestMapping(value="/song")
public class SongsController {
	@Autowired
	private SongService songService;
	
	
	
	@Qualifier(value="songService")
	public void setSongService(SongService songService) {
		this.songService = songService;
	}
	
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public void addSong(@RequestBody Song song) {
		
		this.songService.addSong(song);
	}
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public List<Song>  getAllSongs() {
		return this.songService.getALLSongs();
	}
	@RequestMapping(value="/{songId}", method = RequestMethod.GET)
	public Song getSong(@PathVariable("songId") int songId ) {
		System.out.println("id = "+songId);
		return this.songService.getSong(songId);
	}
	
	@RequestMapping(value="/{songId}", method = RequestMethod.DELETE)
	public void deleteSong(@PathVariable("songId") int songId) {
		this.songService.deleteSong(songId);
	}
	
	@RequestMapping(value="/", method = RequestMethod.PUT)
	public Song updateSongDetail(@RequestBody Song song) {
		System.out.println("id update = "+song.getId());
		return this.songService.updateSongDetail(song);
	}

}
