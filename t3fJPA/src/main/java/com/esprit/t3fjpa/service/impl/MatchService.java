package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface MatchService {
	void add(Math math);
	void delete(Math math);
	void update(Math math);
	List<Math>findAll();
	Math findById(int id);

}
