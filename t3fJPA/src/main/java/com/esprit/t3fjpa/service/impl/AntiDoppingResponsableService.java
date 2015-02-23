package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.AntiDoppingResponsable;
import com.esprit.t3fjpa.domain.Clerck;
import com.esprit.t3fjpa.domain.Player;


@Remote
public interface AntiDoppingResponsableService {
	void add(AntiDoppingResponsable resp);
	void delete(AntiDoppingResponsable resp);
	void update(AntiDoppingResponsable resp);
	List<AntiDoppingResponsable>findAll();
	AntiDoppingResponsable findById(int id);

}
