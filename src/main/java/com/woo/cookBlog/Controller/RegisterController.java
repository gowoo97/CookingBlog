package com.woo.cookBlog.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woo.cookBlog.DTO.UserDTO;
import com.woo.cookBlog.service.UserService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public String registerPage() {
		return "register";
	}
	
	@PostMapping
	public String RegisterUser(Model model,HttpServletRequest req,HttpServletResponse res) {
		String id=req.getParameter("id");
		String password=req.getParameter("password");
		String password_confirm=req.getParameter("password_confirm");
		String nickname=req.getParameter("nickname");
		
		UserDTO user=new UserDTO();
		user.setId(id);
		user.setPassword(password);
		user.setNickName(nickname);
		
		userService.insertUser(user);
		
		return "alert";
	}
	
}
