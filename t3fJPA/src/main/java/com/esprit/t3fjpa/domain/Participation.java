package com.esprit.t3fjpa.domain;

import java.io.Serializable;


import javax.persistence.*;

/**
 * Entity implementation class for Entity: Participation
 *
 */
@Entity

public class Participation implements Serializable {

	   
	
	private int id;
	private Player player;
	private Contest contest;
	private Teams teams;
	
	private static final long serialVersionUID = 1L;

	public Participation() {
		super();
	} 
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	@ManyToOne 
	public Contest getContest() {
		return contest;
	}
	public void setContest(Contest contest) {
		this.contest = contest;
	}
	@ManyToOne
	public Teams getTeams() {
		return teams;
	}
	public void setTeams(Teams teams) {
		this.teams = teams;
	}
	
	

   
}
