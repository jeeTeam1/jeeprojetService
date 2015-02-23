package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.Location;

@Remote
public interface LocationService {
	void add(Location location);
	void delete(Location location);
	void update(Location location);
	List<Location>findAll();
	Location findById(int id);

}
