package com.esprit.t3fjpa.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.esprit.t3fjpa.domain.Clerck;
import com.esprit.t3fjpa.service.impl.ClerckService;
@Stateless
public class ClerckServiceImpl  implements ClerckService
{
	@PersistenceContext(unitName="t3fJPA")
	EntityManager entitymanager;
	@Override
	public void add(Clerck clerck) {
		entitymanager.persist(clerck);

		
	}

	@Override
	public void delete(Clerck clerck) {
		entitymanager.remove(entitymanager.merge(clerck));
		
	}

	@Override
	public void update(Clerck clerck) {
		entitymanager.merge(clerck);
		
	}

	@Override
	public List<Clerck> findAll() {
	
Query query=entitymanager.createQuery("SELECT p FROM Player p");
		


		return query.getResultList()  ;
	}

	@Override
	public Clerck findById(int id) {
		Clerck clerck ;
		clerck=entitymanager.find(Clerck.class,id);
		
		return clerck;
	}

	@Override
	public Clerck findByLP(String login, String password) {
	Clerck clerck;
	Query query=entitymanager.createQuery("");
	return clerck;
	}
	

}
