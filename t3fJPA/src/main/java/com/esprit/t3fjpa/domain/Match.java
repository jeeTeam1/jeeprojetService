package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Match
 *
 */
@Entity

public class Match implements Serializable {

	   
	
	private int id;
	private Date date;
	private Referee referee;
	private Location location;
	private Set<ResultMatch>resultMatchs;
	
	private static final long serialVersionUID = 1L;

	public Match() {
		super();
	}   
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@ManyToOne
	public Referee getReferee() {
		return referee;
	}
	public void setReferee(Referee referee) {
		this.referee = referee;
	}
	@ManyToOne
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	@OneToMany(mappedBy="match")
	public Set<ResultMatch> getResultMatchs() {
		return resultMatchs;
	}
	public void setResultMatchs(Set<ResultMatch> resultMatchs) {
		this.resultMatchs = resultMatchs;
	}
	
	
	

   
}
