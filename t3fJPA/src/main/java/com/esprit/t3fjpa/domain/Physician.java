package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Physician
 *
 */
@Entity

public class Physician implements Serializable {

	   
	
	private int id;
	private String name;
	private String lastName;
	private Set<PhysicalTest>physicalTests;
	private static final long serialVersionUID = 1L;

	public Physician() {
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
	@OneToMany(mappedBy="physician")
	public Set<PhysicalTest> getPhysicalTests() {
		return physicalTests;
	}
	public void setPhysicalTests(Set<PhysicalTest> physicalTests) {
		this.physicalTests = physicalTests;
	}
   
}
