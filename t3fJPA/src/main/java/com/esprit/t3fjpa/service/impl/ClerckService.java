package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.Clerck;


@Remote
public interface ClerckService {
	void add(Clerck clerck);
	void delete(Clerck clerck);
	void update(Clerck clerck);
	List<Clerck>findAll();
	Clerck findById(int id);
	Integer findByLP(String login ,String password);

}
