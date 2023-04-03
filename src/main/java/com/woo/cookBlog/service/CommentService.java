package com.woo.cookBlog.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.woo.cookBlog.DTO.CommentDTO;
import com.woo.cookBlog.repository.CommentDAO;

public class CommentService {

	@Autowired
	private CommentDAO commentDAO;
	
	
	public void insertComment(CommentDTO commentDTO) {
		commentDAO.insert(commentDTO);
	}
	
}
