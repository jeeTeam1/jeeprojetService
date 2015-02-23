package com.esprit.t3fjpa.service.impl;

import java.util.List;

import javax.ejb.Remote;

import com.esprit.t3fjpa.domain.Comment;

@Remote
public interface CommentService {
	void add(Comment comment);
	void delete(Comment comment);
	void update(Comment comment);
	List<Comment>findAll();
	Comment findById(int id);

}
