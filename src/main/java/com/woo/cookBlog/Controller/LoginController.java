package com.woo.cookBlog.Controller;

import javax.servlet.http.Cookie;
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
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public String loginPage() {
		return "login";
	}
	
	@PostMapping
	public String login(Model model,HttpServletRequest req,HttpServletResponse res) {
		String id=req.getParameter("id");
		String pw=req.getParameter("password");
		
		UserDTO user=userService.findUser(id);
		
		if(pw.equals(user.getPassword())) {
			Cookie cookie_id=new Cookie("id",user.getId());
			Cookie cookie_nickname=new Cookie("nickname",user.getNickName());
			
			res.addCookie(cookie_nickname);
			res.addCookie(cookie_id);
			
			
			return "redirect:/";
		}
		else {
			return "alert";
		}
		
		
	}
	
}
