package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.TrainingSession;

@Remote
public interface TrainingSessionService {
	void add(TrainingSession trainingSession);
	void delete(TrainingSession trainingSession);
	void update(TrainingSession trainingSession);
	List<TrainingSession>findAll();
	TrainingSession findById(int id);

}
