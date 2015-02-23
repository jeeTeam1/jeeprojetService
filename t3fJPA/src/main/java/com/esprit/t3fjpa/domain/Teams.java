package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Teams
 *
 */
@Entity

public class Teams implements Serializable {

	   
	
	private int id;
	private Set<Participation>participations;
	private Set<ResultMatch>resultMatchs;



	private static final long serialVersionUID = 1L;

	public Teams() {
		super();
	}   
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@OneToMany
	public Set<Participation> getParticipations() {
		return participations;
	}
	public void setParticipations(Set<Participation> participations) {
		this.participations = participations;
	}
	@OneToMany
	public Set<ResultMatch> getResultMatchs() {
		return resultMatchs;
	}
	public void setResultMatchs(Set<ResultMatch> resultMatchs) {
		this.resultMatchs = resultMatchs;
	}
	


	

	
   
}
