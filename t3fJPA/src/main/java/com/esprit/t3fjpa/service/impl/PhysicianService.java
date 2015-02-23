package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.Physician;


@Remote
public interface PhysicianService {
	void add(Physician physician);
	void delete(Physician physician);
	void update(Physician physician);
	List<Physician >findAll();
	Physician  findById(int id);

}
