package com.mindtree.omsProject.dao;

import java.util.List;

import com.mindtree.omsProject.entity.Track;

public interface TrackDao {
	public boolean addtrack(Track track);
	public List<Track> gettrack();

}
