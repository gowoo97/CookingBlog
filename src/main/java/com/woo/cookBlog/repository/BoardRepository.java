package com.woo.cookBlog.repository;

import java.util.List;

import com.woo.cookBlog.DTO.BoardDTO;

public interface BoardRepository {
	public void insertBoard(BoardDTO boardDTO);
	public List<BoardDTO> selectBoard();
	public BoardDTO selectBoardBySeq(int no);
}
