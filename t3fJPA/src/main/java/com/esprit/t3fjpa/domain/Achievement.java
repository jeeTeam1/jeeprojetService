package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Achievement
 *
 */
@Entity

public class Achievement implements Serializable {

	   
	
	private int id;
	private String title;
	private String type;
	private Date date;
	private Set<Player> player;
	private static final long serialVersionUID = 1L;

	public Achievement() {
		super();
	}  
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	@ManyToMany
	public Set<Player> getPlayer() {
		return player;
	}
	public void setPlayer(Set<Player> player) {
		this.player = player;
	}

   
}
