package com.mindtree.omsProject.dao;

import java.util.List;

import com.mindtree.omsProject.entity.CampusMind;


public interface CampusMindDao {
	
	public boolean addcampusmind(CampusMind campusMind);
	public List<CampusMind> getcampusmind();
	
	void deleteCampusMind(int mid);
	CampusMind updateCampusMind(CampusMind campusMind);
	 

}
