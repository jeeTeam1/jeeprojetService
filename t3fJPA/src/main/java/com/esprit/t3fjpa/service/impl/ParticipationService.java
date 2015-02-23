package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.Participation;

@Remote
public interface ParticipationService {
	void add(Participation participation);
	void delete(Participation participation);

	List<Participation>findAll();
	Participation findById(int id);

}
