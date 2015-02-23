package com.esprit.t3fjpa.service.impl;

import java.util.List;
import java.util.Set;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.Player;

@Remote
public interface PlayerService {
	void add(Player player);
	void delete(Player player);
	void update(Player player);
	List<Player>findAll();
	Player findById(int id);
	
	
	
	
	

}
