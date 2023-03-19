package com.woo.cookBlog.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.woo.cookBlog.DTO.UserDTO;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
public class UserDAOTest {
	
	@Autowired
	UserDAO userDAO;

	@Test
	public void testFindUserById() {
		UserDTO user=userDAO.findUserById("tom123");
		Assert.assertEquals("tom123",user.getId());
		Assert.assertEquals("sssss", user.getNickName());
	}

}
