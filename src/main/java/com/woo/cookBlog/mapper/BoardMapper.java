package com.woo.cookBlog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woo.cookBlog.DTO.BoardDTO;

public interface BoardMapper {
	public void insertBoard(BoardDTO boardDTO);
	public List<BoardDTO> selectBoard(@Param("start") int start , @Param("cnt") int cnt);
	public BoardDTO selectBoardBySeq(int no);
}
