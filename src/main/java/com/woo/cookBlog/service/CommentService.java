package com.woo.cookBlog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woo.cookBlog.DTO.CommentDTO;
import com.woo.cookBlog.repository.CommentDAO;

@Service	
public class CommentService {

	@Autowired
	private CommentDAO commentDAO;
	
	
	public void insertComment(CommentDTO commentDTO) {
		commentDAO.insert(commentDTO);
	}
	
	public List<CommentDTO> getComments(int no){
		
		List<CommentDTO> comments=commentDAO.selectComment(no);
		
		if(comments.size()==0) {
			return null;
		}else
			return comments;
		
		
	}
	
}
