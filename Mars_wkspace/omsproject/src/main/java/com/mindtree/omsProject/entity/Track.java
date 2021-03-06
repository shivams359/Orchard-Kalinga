package com.mindtree.omsProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Track {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private  int id;
	
	@Column(name = "track_id")
	private  int trackid;
	
	@Column(name = "track_name", nullable = false)
	private String trackname;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTrackid() {
		return trackid;
	}

	public void setTrackid(int trackid) {
		this.trackid = trackid;
	}

	public String getTrackname() {
		return trackname;
	}

	public void setTrackname(String trackname) {
		this.trackname = trackname;
	}

	@Override
	public String toString() {
		return "Track [trackid=" + trackid + ", trackname=" + trackname + "]";
	}
	
}
