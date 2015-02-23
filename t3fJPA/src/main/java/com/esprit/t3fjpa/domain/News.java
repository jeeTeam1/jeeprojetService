package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: News
 *
 */
@Entity

public class News implements Serializable {

	   
	
	private int id;
	private String type;
	private String title;
	private Set<Contest>contests;
	private Set<Comment>comments;
	private static final long serialVersionUID = 1L;

	public News() {
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
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@ManyToMany
	public Set<Contest> getContests() {
		return contests;
	}
	public void setContests(Set<Contest> contests) {
		this.contests = contests;
	}
	@ManyToMany
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
   
}
