package com.mindtree.omsProject.service.OmsProjectService;

import java.util.List;

import com.mindtree.omsProject.entity.CampusMind;

public interface CampusMindService {

	public boolean addcampusmind(CampusMind campusMind);
	public List<CampusMind> getcampusmind();
	
	void deleteCampusMind(int mid);
	CampusMind updateCampusMindDetail(CampusMind campusMind);
	
	
}
