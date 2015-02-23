package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Equipment
 *
 */
@Entity

public class Equipment implements Serializable {

	   
	
	private int id;
	private String type;
	private Date date;
	private Association association;
	private static final long serialVersionUID = 1L;

	public Equipment() {
		super();
	} 
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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
	@ManyToOne
	public Association getAssociation() {
		return association;
	}
	public void setAssociation(Association association) {
		this.association = association;
	}
   
}
