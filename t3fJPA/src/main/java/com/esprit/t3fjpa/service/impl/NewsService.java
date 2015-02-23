package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.enterprise.inject.New;

import com.esprit.t3fjpa.domain.News;

@Remote
public interface NewsService {
	void add(News news);
	void delete(News news);
	void update(News news);
	List<News>findAll();
	News findById(int id);

}
