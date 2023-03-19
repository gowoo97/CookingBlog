package com.woo.cookBlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woo.cookBlog.DTO.UserDTO;
import com.woo.cookBlog.repository.UserDAO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	
	public void insertUser(UserDTO user) {
		userDAO.insertUser(user);
	}
	
	public UserDTO findUser(String id) {
		return userDAO.findUserById(id);
	}
	
}
