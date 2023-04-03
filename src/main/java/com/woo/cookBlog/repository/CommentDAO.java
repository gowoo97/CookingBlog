package com.woo.cookBlog.repository;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.woo.cookBlog.DTO.CommentDTO;

@Repository
public class CommentDAO {
JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	
	public void insert(CommentDTO commentDTO) {
		
		String sql="insert into comment(board_num,id,comment,create_date)"
				+ "values(?,?,?,?)";
		
		jdbcTemplate.update(sql,commentDTO.getBoard_num(),commentDTO.getId(),
				commentDTO.getComment(),commentDTO.getCreate_date());
		
		
	}
	
	
}
