package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: AntiDoppingResponsable
 *
 */
@Entity

public class AntiDoppingResponsable implements Serializable {

	   
	
	private int id;
	private String name;
	private String lastName;
	private String login;
	private String password;
	private Set<PhysicalTest>physicalTests;
	private static final long serialVersionUID = 1L;

	public AntiDoppingResponsable() {
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
	@OneToMany (mappedBy="antiDoppingResponsable")
	public Set<PhysicalTest> getPhysicalTests() {
		return physicalTests;
	}
	public void setPhysicalTests(Set<PhysicalTest> physicalTests) {
		this.physicalTests = physicalTests;
	}
   
}
