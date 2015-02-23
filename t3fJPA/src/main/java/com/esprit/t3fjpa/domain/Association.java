package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import java.util.Set;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize.Engineering;

/**
 * Entity implementation class for Entity: Association
 *
 */
@Entity

public class Association implements Serializable {

	   
	
	private int id;
	private String name;
	private Date creationDate;
	private String description;
	private String login;
	private String password;
	private  Set<Engagement> engagement;
	
	

	private Set<Equipment>equipments;
	private static final long serialVersionUID = 1L;

	public Association() {
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
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@OneToMany(mappedBy="association")
	public Set<Equipment> getEquipments() {
		return equipments;
	}
	public void setEquipments(Set<Equipment> equipments) {
		this.equipments = equipments;
	}
	@OneToMany(mappedBy="association")
	public Set<Engagement> getEngagement() {
		return engagement;
	}
	public void setEngagement(Set<Engagement> engagement) {
		this.engagement = engagement;
	}
   
}
