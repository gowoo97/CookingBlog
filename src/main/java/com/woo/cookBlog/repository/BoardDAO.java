package com.woo.cookBlog.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.woo.cookBlog.DTO.BoardDTO;

@Repository
public class BoardDAO {
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	public void insertBoard(BoardDTO boardDTO) {
		String sql="insert into board(id,content,title) values(?,?,?)";
		jdbcTemplate.update(sql,boardDTO.getId(),boardDTO.getContent(),boardDTO.getTitle());
	}
	
	
}
