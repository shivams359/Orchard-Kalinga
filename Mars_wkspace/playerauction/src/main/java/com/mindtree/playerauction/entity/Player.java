package com.mindtree.playerauction.entity;

public class Player 
{
	String player_no;
	String category;
	int highestscore;
	String bestfigure;
	public Player() {
		super();
		
	}
	public Player(String player_no, String category, int highestscore, String bestfigure) {
		super();
		this.player_no = player_no;
		this.category = category;
		this.highestscore = highestscore;
		this.bestfigure = bestfigure;
	}
	public String getPlayer_no() {
		return player_no;
	}
	public void setPlayer_no(String player_no) {
		this.player_no = player_no;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getHighestscore() {
		return highestscore;
	}
	public void setHighestscore(int highestscore) {
		this.highestscore = highestscore;
	}
	public String getBestfigure() {
		return bestfigure;
	}
	public void setBestfigure(String bestfigure) {
		this.bestfigure = bestfigure;
	}
	

}
