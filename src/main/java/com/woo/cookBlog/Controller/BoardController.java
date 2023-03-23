package com.woo.cookBlog.Controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.woo.cookBlog.DTO.BoardDTO;
import com.woo.cookBlog.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/writePage")
	public String page() {
		return "write";
	}
	
	@GetMapping("/boardList")
	public String boardList(Model model) {

		model.addAttribute("boards", boardService.getBoards());
		
		return "boardList";
	}
	
	@RequestMapping(value="/write" , method=RequestMethod.POST)
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
		
		return "redirect:/board/boardList";
	}
	
	
	
	
	
	
}