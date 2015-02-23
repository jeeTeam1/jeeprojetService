package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.lang.Byte;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Referee
 *
 */
@Entity

public class Referee implements Serializable {

	   

	private int id;
	private String name;
	private String lastName;
	private String grade;
	private Byte photo;
	private String type;
	private Set<Match>matchs;
	private Set<TrainingSession>trainingSessions;
	
	private static final long serialVersionUID = 1L;

	public Referee() {
		super();
	}  
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}  
	@Lob
	public Byte getPhoto() {
		return this.photo;
	}

	public void setPhoto(Byte photo) {
		this.photo = photo;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@OneToMany(mappedBy="referee")
	public Set<Match> getMatchs() {
		return matchs;
	}
	public void setMatchs(Set<Match> matchs) {
		this.matchs = matchs;
	}
	@ManyToMany(mappedBy="referees")
	public Set<TrainingSession> getTrainingSessions() {
		return trainingSessions;
	}
	public void setTrainingSessions(Set<TrainingSession> trainingSessions) {
		this.trainingSessions = trainingSessions;
	}
   
}
