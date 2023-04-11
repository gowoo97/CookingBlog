package com.woo.cookBlog.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.woo.cookBlog.DTO.BoardDTO;

@Repository
public class BoardDAO implements BoardRepository{
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	public void insertBoard(BoardDTO boardDTO) {
		String sql="insert into board(id,content,title) values(?,?,?)";
		jdbcTemplate.update(sql,boardDTO.getId(),boardDTO.getContent(),boardDTO.getTitle());
	}
	
	public List<BoardDTO> selectBoard(){
		String sql="select * from board";
	List<BoardDTO> boards=jdbcTemplate.query(
					sql,
					(rs,rowNum) ->{
						BoardDTO boardDTO=new BoardDTO();
						boardDTO.setSeq(rs.getInt("seq"));
						boardDTO.setId(rs.getString("id"));
						boardDTO.setTitle(rs.getString("title"));
						boardDTO.setContent(rs.getString("content"));
						boardDTO.setCreate_date(rs.getTimestamp("create_date"));
						return boardDTO;
					}
				);
	
		return boards;
	}
	
	public BoardDTO selectBoardBySeq(int no) {
		String sql="select * from board where seq="+no;
		return jdbcTemplate.queryForObject(sql,(rs,rowNum) -> {
			BoardDTO boardDTO=new BoardDTO();
			boardDTO.setSeq(rs.getInt("seq"));
			boardDTO.setId(rs.getString("id"));
			boardDTO.setTitle(rs.getString("title"));
			boardDTO.setContent(rs.getString("content"));
			boardDTO.setCreate_date(rs.getTimestamp("create_date"));
			return boardDTO;
		});
	}
	
}
