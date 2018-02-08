package com.mindtree.player.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Player")
public class Player {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int player_no;
	@Column
	private String player_name;
	@Column
	private TeamDetails catogery;
	@Column
	private String score;
	@Column
	private String best_figure;
	public Player() {
		super();
		
	}
	public Player(int player_no, String player_name, TeamDetails catogery, String score, String best_figure) {
		super();
		this.player_no = player_no;
		this.player_name = player_name;
		this.catogery = catogery;
		this.score = score;
		this.best_figure = best_figure;
	}
	public int getPlayer_no() {
		return player_no;
	}
	public void setPlayer_no(int player_no) {
		this.player_no = player_no;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public TeamDetails getCatogery() {
		return catogery;
	}
	public void setCatogery(TeamDetails catogery) {
		this.catogery = catogery;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getBest_figure() {
		return best_figure;
	}
	public void setBest_figure(String best_figure) {
		this.best_figure = best_figure;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + player_no;
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
		Player other = (Player) obj;
		if (player_no != other.player_no)
			return false;
		return true;
	}
	

}
