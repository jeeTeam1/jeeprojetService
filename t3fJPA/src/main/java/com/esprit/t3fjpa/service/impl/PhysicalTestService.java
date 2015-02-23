package com.esprit.t3fjpa.service.impl;

import java.util.List;

import com.esprit.t3fjpa.domain.PhysicalTest;



public interface PhysicalTestService {
	void add(PhysicalTest physicalTest);
	void delete(PhysicalTest physicalTest);
	void update(PhysicalTest physicalTest);
	List<PhysicalTest>findAll();
	PhysicalTest findById(int id);

}
