package com.woo.cookBlog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woo.cookBlog.DTO.BoardDTO;
import com.woo.cookBlog.mapper.BoardMapper;

@Service
public class BoardService {
	
	@Autowired
	private BoardMapper boardDAO;
	
	
	public void insertBoard(BoardDTO boardDTO) {
		boardDAO.insertBoard(boardDTO);
	}
	
	
	public List<BoardDTO> getBoards(){
		return boardDAO.selectBoard();
	}
	
	public BoardDTO getBoardBySeq(int no) {
		return boardDAO.selectBoardBySeq(no);
	}

}
