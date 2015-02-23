package com.esprit.t3fjpa.service;

import java.util.List;










import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.t3fjpa.domain.Player;
import com.esprit.t3fjpa.service.impl.PlayerService;

@Stateless

public class PlayerServiceImpl implements  PlayerService
{
	@PersistenceContext(unitName="t3fJPA")
	EntityManager entitymanager;
	

	@Override
	public void add(Player player) {
	
		entitymanager.persist(player);
		
		
		
	
		
	}

	@Override
	public void delete(Player player) {
		entitymanager.remove(entitymanager.merge(player));
	
		
	}


	@Override
	public List<Player> findAll() {
  Query query=entitymanager.createQuery("SELECT p FROM Player p");
  
	
		return query.getResultList();
	}

	@Override
	public Player findById(int id ) {
		Player player;
		  player= entitymanager.find(Player.class, id);
		  return player;
	

	}

	@Override
	public void update(Player player) {
		entitymanager.merge(player);
		
	}

	

}
