package com.mindtree.songs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SongsData {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int songid;
	@Column
	private String songname;
	@Column
	private String movie;
	@Column
	private String singer;
	public SongsData(int songid, String songname, String movie, String singer) {
		super();
		this.songid = songid;
		this.songname = songname;
		this.movie = movie;
		this.singer = singer;
	}
	public SongsData() {
		super();
	}
	public int getSongid() {
		return songid;
	}
	public void setSongid(int songid) {
		this.songid = songid;
	}
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + songid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SongsData other = (SongsData) obj;
		if (songid != other.songid)
			return false;
		return true;
	}
	
}
