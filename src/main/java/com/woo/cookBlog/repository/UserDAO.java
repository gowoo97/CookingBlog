package com.woo.cookBlog.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.woo.cookBlog.DTO.UserDTO;

@Repository
public class UserDAO {
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	
	public void insertUser(UserDTO userDTO) {
		String sql="insert into user(id,password,nickname) values(?,?,?)";
		jdbcTemplate.update(sql,userDTO.getId(),userDTO.getPassword(),userDTO.getNickName());
	}
	
	public UserDTO findUserById(String id) {
		String sql="select * from user where id=?";
		UserDTO rst=jdbcTemplate.queryForObject(sql,(rs,rownum) -> {
			UserDTO user=new UserDTO();
			user.setId(rs.getString("id"));
			user.setPassword(rs.getString("password"));
			user.setNickName(rs.getString("nickname"));
			
			return user;
		},id);
		return rst;
	}
	
}
