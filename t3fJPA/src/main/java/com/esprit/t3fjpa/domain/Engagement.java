package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Engagement
 *
 */
@Entity

public class Engagement implements Serializable {

	
	private Date date;
	private EngagementPk engagementPk;
	private Association association;
	private Player player;
	private static final long serialVersionUID = 1L;

	public Engagement() {
		super();
	}  

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
@EmbeddedId
	public EngagementPk getEngagementPk() {
		return engagementPk;
	}

	public void setEngagementPk(EngagementPk engagementPk) {
		this.engagementPk = engagementPk;
	}
@ManyToOne
@JoinColumn(name="association_id",referencedColumnName="id",insertable=false,updatable=false)
	public Association getAssociation() {
		return association;
	}

	public void setAssociation(Association association) {
		this.association = association;
	}
@ManyToOne 
@JoinColumn(name="player_id",referencedColumnName="id",insertable=false,updatable=false)
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	
	

}
