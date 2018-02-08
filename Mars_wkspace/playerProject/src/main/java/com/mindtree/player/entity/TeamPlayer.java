package com.mindtree.player.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Player")
public class TeamPlayer {
@Column
private int playerNo;
@Id
@Column
private int teamId;
public TeamPlayer() {
	super();
	// TODO Auto-generated constructor stub
}
public TeamPlayer(int playerNo, int teamId) {
	super();
	this.playerNo = playerNo;
	this.teamId = teamId;
}
public int getPlayerNo() {
	return playerNo;
}
public void setPlayerNo(int playerNo) {
	this.playerNo = playerNo;
}
public int getTeamId() {
	return teamId;
}
public void setTeamId(int teamId) {
	this.teamId = teamId;
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
