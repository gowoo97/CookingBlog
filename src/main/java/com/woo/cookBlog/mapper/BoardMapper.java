package com.woo.cookBlog.mapper;

import java.util.List;

import com.woo.cookBlog.DTO.BoardDTO;

public interface BoardMapper {
	public void insertBoard(BoardDTO boardDTO);
	public List<BoardDTO> selectBoard();
	public BoardDTO selectBoardBySeq(int no);
}
