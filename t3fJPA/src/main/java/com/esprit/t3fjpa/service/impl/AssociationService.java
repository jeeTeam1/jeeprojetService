package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.Association;
@Remote
public interface AssociationService {
	void add(Association association);
	void delete(Association association);
	void update(Association association);
	List<Association>findAll();
	Association  findById(int id);

}
