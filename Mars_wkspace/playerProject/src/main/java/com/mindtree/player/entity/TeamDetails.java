package com.mindtree.player.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TeamDetails")
public class TeamDetails {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int teamid;
	private String teamname;
	public TeamDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamDetails(int teamid, String teamname) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + teamid;
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
		TeamDetails other = (TeamDetails) obj;
		if (teamid != other.teamid)
			return false;
		return true;
	}
	
	

}
