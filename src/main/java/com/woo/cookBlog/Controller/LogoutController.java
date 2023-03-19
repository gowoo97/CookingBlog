package com.woo.cookBlog.Controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logout")
public class LogoutController {
	
	@GetMapping
	public String logout(HttpServletRequest req,HttpServletResponse res) {
		Cookie[] cookies=req.getCookies();
		
		for(Cookie co:cookies) {
			co.setMaxAge(0);
			res.addCookie(co);
		}
		
		return "redirect:/";
	}
	
}
