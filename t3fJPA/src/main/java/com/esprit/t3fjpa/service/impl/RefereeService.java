package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.Referee;

@Remote
public interface RefereeService {
	void add(Referee referee);
	void delete(Referee referee);
	void update(Referee referee);
	List<Referee >findAll();
	Referee findById(int id);

}
