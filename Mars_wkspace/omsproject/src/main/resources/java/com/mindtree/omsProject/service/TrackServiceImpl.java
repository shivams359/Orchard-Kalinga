package com.mindtree.omsProject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.omsProject.dao.TrackDao;
import com.mindtree.omsProject.entity.Track;
import com.mindtree.omsProject.service.OmsProjectService.TrackService;

@Service
@Transactional
public class TrackServiceImpl implements TrackService{
	
	@Autowired
	private TrackDao trackDao;

	public boolean addtrack(Track track) {
		
		return trackDao.addtrack(track);
		
	}

	public List<Track> gettrack() {
		
		return trackDao.gettrack();
	}

}
