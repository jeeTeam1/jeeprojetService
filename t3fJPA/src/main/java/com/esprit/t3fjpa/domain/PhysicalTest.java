package com.esprit.t3fjpa.domain;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PhysicalTest
 *
 */
@Entity

public class PhysicalTest implements Serializable {

	   
	
	private int id;
	private String medicalSheet;
	private boolean result;
	private Player player;
	private Physician physician;
	private AntiDoppingResponsable antiDoppingResponsable;
	private static final long serialVersionUID = 1L;

	public PhysicalTest() {
		super();
	} 
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getMedicalSheet() {
		return this.medicalSheet;
	}

	public void setMedicalSheet(String medicalSheet) {
		this.medicalSheet = medicalSheet;
	}   
	public boolean getResult() {
		return this.result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	@ManyToOne
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	@ManyToOne
	public Physician getPhysician() {
		return physician;
	}
	public void setPhysician(Physician physician) {
		this.physician = physician;
	}
	@ManyToOne
	public AntiDoppingResponsable getAntiDoppingResponsable() {
		return antiDoppingResponsable;
	}
	public void setAntiDoppingResponsable(AntiDoppingResponsable antiDoppingResponsable) {
		this.antiDoppingResponsable = antiDoppingResponsable;
	}
	
   
}
