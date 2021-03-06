package com.mindtree.questionapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="question")
public class Question {
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private int id;
	
	@Column(name = "song_name")
	private String questionname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongname() {
		return questionname;
	}

	public void setSongname(String songname) {
		this.questionname = songname;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", songname=" + questionname + "]";
	}
	
	

}
