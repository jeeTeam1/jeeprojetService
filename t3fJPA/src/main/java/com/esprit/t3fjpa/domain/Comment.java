package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comment
 *
 */
@Entity

public class Comment implements Serializable {

	   
	
	private int id;
	private String text;
	private Date date;
	private String adressVisitor;
	private Set<News>news;
	private static final long serialVersionUID = 1L;

	public Comment() {
		super();
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}   
	public String getAdressVisitor() {
		return this.adressVisitor;
	}

	public void setAdressVisitor(String adressVisitor) {
		this.adressVisitor = adressVisitor;
	}
	@ManyToMany(mappedBy="comments")
	public Set<News> getNews() {
		return news;
	}
	public void setNews(Set<News> news) {
		this.news = news;
	}
   
}
