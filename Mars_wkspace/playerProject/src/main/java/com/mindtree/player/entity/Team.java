package com.mindtree.player.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@ Entity
@Table(name ="Team")
public class Team {
	@Id
	@Column
	public int teamId;
	@Column
	public String teamname;
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(int teamId, String teamname) {
		super();
		this.teamId = teamId;
		this.teamname = teamname;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
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
		result = prime * result + teamId;
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
		Team other = (Team) obj;
		if (teamId != other.teamId)
			return false;
		return true;
	}
	

}
