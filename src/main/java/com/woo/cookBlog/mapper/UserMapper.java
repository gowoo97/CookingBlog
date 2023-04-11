package com.woo.cookBlog.mapper;

import com.woo.cookBlog.DTO.UserDTO;

public interface UserMapper {
	public void insertUser(UserDTO userDTO);
	public UserDTO findUserById(String id);
}
