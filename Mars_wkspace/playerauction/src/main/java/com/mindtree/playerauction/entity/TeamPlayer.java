package com.mindtree.playerauction.entity;

@Entity
@Table(name="TeamPlayer")
public class TeamPlayer {
	@Id
	@COLUMN
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int teamId;
	Private String  playerName;
	public TeamPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamPlayer(int teamId, Private string) {
		super();
		this.teamId = teamId;
		String = string;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public Private getString() {
		return String;
	}
	public void setString(Private string) {
		String = string;
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
		TeamPlayer other = (TeamPlayer) obj;
		if (teamId != other.teamId)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	

}
