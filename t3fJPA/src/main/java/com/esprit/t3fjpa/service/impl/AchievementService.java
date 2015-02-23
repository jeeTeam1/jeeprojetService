package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.Achievement;

@Remote
public interface AchievementService {
	void add(Achievement achievement);
	void delete(Achievement achievement);
	void update(Achievement achievement);
	List<Achievement >findAll();
	Achievement  findById(int id);

}
