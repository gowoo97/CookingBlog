package com.woo.cookBlog.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.woo.cookBlog.mapper.PagingMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class PagingServiceTest {
	
	@Autowired
	private PagingMapper mapper;
	
	@Test
	public void getNumOfBoard() {
		System.out.println(mapper.getNumOfBoard());
	}
	
}
