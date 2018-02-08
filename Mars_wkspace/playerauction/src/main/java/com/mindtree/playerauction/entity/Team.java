package com.mindtree.playerauction.entity;

public class Team {
	int team_id;
	String team_name;
	public Team() {
		super();
	
	}
	public Team(int team_id, String team_name) {
		super();
		this.team_id = team_id;
		this.team_name = team_name;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	
	

}
