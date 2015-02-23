package com.esprit.t3fjpa.domain;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ResultMatch
 *
 */
@Entity

public class ResultMatch implements Serializable {

	
	private boolean winner;
	private ResultPk resultPk;
	private Match match;
	private Teams teams;
	
	private static final long serialVersionUID = 1L;

	public ResultMatch() {
		super();
	}   
	public boolean getWinner() {
		return this.winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	@EmbeddedId
	public ResultPk getResultPk() {
		return resultPk;
	}
	public void setResultPk(ResultPk resultPk) {
		this.resultPk = resultPk;
	}
	@ManyToOne
	@JoinColumn(name="match_id",referencedColumnName="id",insertable=false,updatable=false)
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
	@ManyToOne
	@JoinColumn(name="team_id",referencedColumnName="id",insertable=false,updatable=false)
	public Teams getTeams() {
		return teams;
	}
	public void setTeams(Teams teams) {
		this.teams = teams;
	}
   
}
