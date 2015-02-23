package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.ResultMatch;

@Remote
public interface ResultMatchService {
	void add(ResultMatch resultMatch);
	void delete(ResultMatch resultMatch);
	void update(ResultMatch resultMatch);
	List<ResultMatch>findAll();
	ResultMatch findById(int id);

}
