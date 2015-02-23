package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contest
 *
 */
@Entity

public class Contest implements Serializable {

	   
	
	private int id;
	private String name;
	private Date startingDate;
	private String type;
	private Clerck clerck;
	private Set<Participation>participations;
	private Set<News>news;
	private static final long serialVersionUID = 1L;
	

	public Contest() {
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
	public Date getStartingDate() {
		return this.startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@OneToMany(mappedBy="contest")
	public Set<Participation> getParticipations() {
		return participations;
	}
	public void setParticipations(Set<Participation> participations) {
		this.participations = participations;
	}
	@ManyToOne
	public Clerck getClerck() {
		return clerck;
	}
	public void setClerck(Clerck clerck) {
		this.clerck = clerck;
	}
	@ManyToMany(mappedBy="contests" )
	public Set<News> getNews() {
		return news;
	}
	public void setNews(Set<News> news) {
		this.news = news;
	}
   
}
