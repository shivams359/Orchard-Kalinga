package com.mindtree.omsProject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.omsProject.dao.CampusMindDao;
import com.mindtree.omsProject.entity.CampusMind;
import com.mindtree.omsProject.service.OmsProjectService.CampusMindService;

@Service
@Transactional
public class CampusMindServiceImpl implements CampusMindService {
	
	@Autowired
	private CampusMindDao campusMindDao;

	public boolean addcampusmind(CampusMind campusMind) {
		campusMindDao.addcampusmind(campusMind);
		return false;
	}

	public List<CampusMind> getcampusmind() {
		
		return campusMindDao.getcampusmind();
	}

}
