package com.mindtree.firstrestapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Song")
public class Song {
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private int id;
	
	@Column
	private String name;
	@Column
	private String artists;
	@Column
	private String url;
	@Column
	private String album;
	@Column
	private String duration;
	
	@Column
	private String uploaderName;
	@Column
	private String uploaderLocation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtists() {
		return artists;
	}
	public void setArtists(String artists) {
		this.artists = artists;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getUploaderName() {
		return uploaderName;
	}
	public void setUploaderName(String uploaderName) {
		this.uploaderName = uploaderName;
	}
	public String getUploaderLocation() {
		return uploaderLocation;
	}
	public void setUploaderLocation(String uploaderLocation) {
		this.uploaderLocation = uploaderLocation;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", artists=" + artists + ", url=" + url + ", album=" + album
				+ ", duration=" + duration + ", uploaderName=" + uploaderName + ", uploaderLocation=" + uploaderLocation
				+ "]";
	}
	
	

}
