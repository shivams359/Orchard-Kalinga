package com.mindtree.omsProject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.omsProject.dao.CapabilityDao;
import com.mindtree.omsProject.entity.Capability;
import com.mindtree.omsProject.service.OmsProjectService.CapabilityService;

@Service
@Transactional
public class CapabilityServiceImpl implements CapabilityService {
	
	@Autowired
	private CapabilityDao capabilityDao;

	public boolean addcapability(Capability capability) {
		
		capabilityDao.addcapability(capability);
		return false;
	}

	public List<Capability> getcapability() {
		
		return capabilityDao.getcapability();
	}

}
