package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.Contest;

@Remote
public interface ContestService {
	void add(Contest contest);
	void delete(Contest contest);
	void update(Contest contest);
	List<Contest>findAll();
	Contest findById(int id);

}
