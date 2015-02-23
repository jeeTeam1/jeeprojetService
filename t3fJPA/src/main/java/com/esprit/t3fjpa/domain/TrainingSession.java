package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TrainingSession
 *
 */
@Entity

public class TrainingSession implements Serializable {

	   
	
	private int id;
	private Date date;
	private Set<Referee>referees;
	private Location location;
	
	private static final long serialVersionUID = 1L;

	public TrainingSession() {
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
	@ManyToMany
	public Set<Referee> getReferees() {
		return referees;
	}
	public void setReferees(Set<Referee> referees) {
		this.referees = referees;
	}
	@ManyToOne
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
   
}
