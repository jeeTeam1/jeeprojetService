package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.Equipment;
@Remote
public interface EquipementDonationService {
	void add(Equipment equipment);
	void delete(Equipment equipment);
	void update(Equipment equipment);
	List<Equipment>findAll();
	Equipment findById(int id);

}
