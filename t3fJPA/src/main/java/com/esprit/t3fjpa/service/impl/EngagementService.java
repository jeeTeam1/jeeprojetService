package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.Engagement;

@Remote
public interface EngagementService {
	void add(Engagement engagement);
	void delete(Engagement engagement);
	void update(Engagement engagement);
	List<Engagement>findAll();
	Engagement findById(int id);

}
