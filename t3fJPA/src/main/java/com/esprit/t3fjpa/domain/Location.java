package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Location
 *
 */
@Entity

public class Location implements Serializable {

	   
	
	private int id;
	private String adress;
	private String type;
	private Set<TrainingSession>trainingSessions;
	private Set<Match>matchs;
	private static final long serialVersionUID = 1L;

	public Location() {
		super();
	}  
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@OneToMany(mappedBy="location")
	public Set<TrainingSession> getTrainingSessions() {
		return trainingSessions;
	}
	public void setTrainingSessions(Set<TrainingSession> trainingSessions) {
		this.trainingSessions = trainingSessions;
	}
	@OneToMany(mappedBy="location")
	public Set<Match> getMatchs() {
		return matchs;
	}
	public void setMatchs(Set<Match> matchs) {
		this.matchs = matchs;
	}
   
}
