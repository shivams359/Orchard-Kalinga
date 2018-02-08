package com.mindtree.omsProject.controller;

import java.util.List;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.omsProject.entity.CampusMind;
import com.mindtree.omsProject.entity.Capability;
import com.mindtree.omsProject.entity.Track;
import com.mindtree.omsProject.service.OmsProjectService.CampusMindService;
import com.mindtree.omsProject.service.OmsProjectService.CapabilityService;
import com.mindtree.omsProject.service.OmsProjectService.TrackService;

@RestController
public class OmsController {
	
	 @Autowired
	    CampusMindService campusMindService;
	    
	    @Autowired
	    CapabilityService capabilityService;
	    
	    @Autowired
	    TrackService trackService;
	    
	    @GET
	    @RequestMapping(value="/getCampusMind")
	    public List<CampusMind> getCampusMind()
	    {
	        return this.campusMindService.getcampusmind();
	    }
	    
	    @GET
	    @RequestMapping(value="/getCapability")
	    public List<Capability> getCapability()
	    {
	        return this.capabilityService.getcapability();
	    }
	    
	    @GET
	    @RequestMapping(value="/getTrack")
	    public List<Track> getTrack()
	    {
	        return this.trackService.gettrack();
	    }

}