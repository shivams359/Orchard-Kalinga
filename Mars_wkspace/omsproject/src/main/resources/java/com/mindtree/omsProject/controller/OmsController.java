package com.mindtree.omsProject.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
	    
	    @POST
	    @RequestMapping(value="/addCampusMind")
	    public boolean addCampusMind( @RequestBody CampusMind campusMind)
	    {
	    	System.out.println(campusMind.getName());
	    	System.out.println(campusMind.getMid());
	    	try{
	    	campusMindService.addcampusmind(campusMind);
	    	return true;
	    	}catch(Exception e ){
	    		return false;
	    	}        
	    }
	    
	    @GET
	    @RequestMapping(value="/getCapability")
	    public List<Capability> getCapability()
	    {
	        return this.capabilityService.getcapability();
	    }
	    
	    @POST
	    @RequestMapping(value="/addCapability")
	    public boolean addCapability( @RequestBody Capability capability)
	    {
	    	try{
	    	capabilityService.addcapability(capability);
	    	return true;
	    	}catch(Exception e ){
	    		return false;
	    	}        
	    }
	    
	    @GET
	    @RequestMapping(value="/getTrack")
	    public List<Track> getTrack()
	    {
	        return this.trackService.gettrack();
	    }
	    
	    @POST
	    @RequestMapping(value="/addTrack")
	    public boolean addTrack( @RequestBody Track track)
	    {
	    	try{
	    	trackService.addtrack(track);
	    	return true;
	    	}catch(Exception e ){
	    		return false;
	    	}        
	    }
}
