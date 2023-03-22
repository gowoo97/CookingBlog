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

import com.woo.cookBlog.DTO.BoardDTO;
import com.woo.cookBlog.service.BoardService;

@Controller
@RequestMapping("/write")
public class WriteController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping
	public String Page() {
		return "write";
	}
	
	@PostMapping
	public String write(Model model,HttpServletResponse res,HttpServletRequest req) {
		
		String content=req.getParameter("content");
		String title=req.getParameter("title");
		String id="";
		
		BoardDTO boardDTO=new BoardDTO();
		boardDTO.setContent(content);
		boardDTO.setTitle(title);
		Cookie cookies[]=req.getCookies();
		
		for(Cookie co:cookies) {
			if(co.getName().equals("id")) {
				id=co.getValue();
				break;
			}
		}
		
		boardDTO.setId(id);
		
		boardService.insertBoard(boardDTO);
		
		return "write";
		
		
	}
	
}
