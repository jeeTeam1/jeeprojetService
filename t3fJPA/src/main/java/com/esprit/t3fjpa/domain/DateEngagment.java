package com.esprit.t3fjpa.domain;

import java.util.Date;

import javax.persistence.Embeddable;
@Embeddable
public class DateEngagment {
	private int id;
	private Date date ;
	public DateEngagment(){}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
