package com.mindtree.songs.controller;



import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.songs.entity.SongsData;
import com.mindtree.songs.services.SongsServiceImp;
import com.mindtree.songs.services.songservice.SongsService;


@RestController
public class SongsRestController {
	
	@RequestMapping(value="/song", method = RequestMethod.POST)
	
	public void adduser(@RequestBody SongsData songData)
	{
		System.out.println(songData.getSongname());
		SongsService songservice=new SongsServiceImp();
		songservice.addsongs(songData);
	
        		 
	}
	

}
