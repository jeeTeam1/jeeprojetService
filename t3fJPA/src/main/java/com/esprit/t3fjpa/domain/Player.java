package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.lang.Byte;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity


public class Player implements Serializable {

	   
	
	private int id;
	private int licenseNumber;
	private String name;
	private String lastName;
	private String sex;
	private int age;
	private String rank;
	private String nationality;
	private Set<Achievement> achievements;
	private Set<PhysicalTest> physicalTest;
	private  Set<Engagement> engagement;

	private Set<Participation>participations;
	
	private byte[] photo;
	private String login;
	private String password;
	private static final long serialVersionUID = 555221221L;

	public Player() {
		super();
	}   
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
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
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}   
	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}   
	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}   
	@Lob
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	  
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	
	@ManyToMany(mappedBy="player")
	public Set<Achievement> getAchievements() {
		return achievements;
	}
	public void setAchievements(Set<Achievement> achievements) {
		this.achievements = achievements;
	}
	@OneToMany(mappedBy="player")
	public Set<PhysicalTest> getPhysicalTest() {
		return physicalTest;
	}
	public void setPhysicalTest(Set<PhysicalTest> physicalTest) {
		this.physicalTest = physicalTest;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
@OneToMany(mappedBy="player")
	public Set<Participation> getParticipations() {
		return participations;
	}
	public void setParticipations(Set<Participation> participations) {
		this.participations = participations;
	}
	@OneToMany(mappedBy="player")
	public Set<Engagement> getEngagement() {
		return engagement;
	}
	public void setEngagement(Set<Engagement> engagement) {
		this.engagement = engagement;
	}

	

	
   
}
