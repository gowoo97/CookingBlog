package com.woo.cookBlog.repository;

import com.woo.cookBlog.DTO.UserDTO;

public interface UserRepository {
	public void insertUser(UserDTO userDTO);
	public UserDTO findUserById(String id);
}
