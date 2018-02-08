package com.mindtree.omsProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Capability {
	
	@Id
	@Column(name = "cap_id")
	private int cid;
	
	@Column(name = "cap_name", nullable = false)
	private String capability;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCapability() {
		return capability;
	}

	public void setCapability(String capability) {
		this.capability = capability;
	}

	@Override
	public String toString() {
		return "Capability [cid=" + cid + ", capability=" + capability + "]";
	}
	
	

}
