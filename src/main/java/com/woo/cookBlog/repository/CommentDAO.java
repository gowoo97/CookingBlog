package com.woo.cookBlog.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.woo.cookBlog.DTO.BoardDTO;
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
	
	public List<CommentDTO> selectComment(int no){
		String sql="select * from comment where board_num ="+no;
		List<CommentDTO> comments=jdbcTemplate.query(
				sql,
				(rs,rowNum) ->{
					CommentDTO comment=new CommentDTO();
					comment.setSeq(rs.getInt("seq"));
					comment.setBoard_num(rs.getInt("board_num"));
					comment.setId(rs.getString("id"));
					comment.setComment(rs.getString("comment"));
					comment.setCreate_date(rs.getTimestamp("create_date"));
					return comment;
				}
			);
		return comments; 
	}
	
	
}
