package com.woo.cookBlog.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.woo.cookBlog.DTO.BoardDTO;
import com.woo.cookBlog.mapper.BoardMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class BoardServiceTest {

	@Autowired
	BoardMapper boardMapper;
	
	@Test
	public void selectNumById() {
		System.out.println((boardMapper.selectBoardBySeq(1)).getContent());
	}
	
	@Test
	public void insertBoard() {
		
	}
	
}
