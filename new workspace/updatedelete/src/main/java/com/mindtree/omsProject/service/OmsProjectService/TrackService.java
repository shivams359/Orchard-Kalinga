package com.mindtree.omsProject.service.OmsProjectService;

import java.util.List;

import com.mindtree.omsProject.entity.Track;

public interface TrackService {

	public boolean addtrack(Track track);
	public List<Track> gettrack();
}
