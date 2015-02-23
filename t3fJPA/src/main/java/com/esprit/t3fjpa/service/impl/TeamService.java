package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.Teams;
@Remote
public interface TeamService {
	void add(Teams teams);
	void delete(Teams teams);
	void update(Teams teams);
	List<Teams>findAll();
	Teams findById(int id);

}
