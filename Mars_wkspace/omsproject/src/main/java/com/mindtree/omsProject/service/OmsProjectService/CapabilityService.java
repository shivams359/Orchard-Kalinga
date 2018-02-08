package com.mindtree.omsProject.service.OmsProjectService;

import java.util.List;

import com.mindtree.omsProject.entity.Capability;

public interface CapabilityService {

	public boolean addcapability(Capability capability);
	public List<Capability> getcapability();
}
