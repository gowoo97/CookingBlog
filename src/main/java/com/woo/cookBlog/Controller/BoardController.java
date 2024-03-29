package com.woo.cookBlog.Controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.woo.cookBlog.DTO.BoardDTO;
import com.woo.cookBlog.DTO.CommentDTO;
import com.woo.cookBlog.DTO.PagingDTO;
import com.woo.cookBlog.service.BoardService;
import com.woo.cookBlog.service.CommentService;
import com.woo.cookBlog.service.PagingService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private CommentService commentService;
	
	@Autowired
	private PagingService pagingService;
	
	@GetMapping("/writePage")
	public String page() {
		return "write";
	}
	
	@GetMapping("/boardList")
	public String boardList(Model model,@RequestParam(value="no",required=false,defaultValue="1") int no) {
		
		
		
		PagingDTO paging=pagingService.getPagingDTO(no,5);
		

		model.addAttribute("paging", paging);
		model.addAttribute("boards", boardService.getBoards(no));
		
		return "boardList";
	}
	
	
	@GetMapping("/boardList/detail")
	public String detail(Model model, int no) {
		BoardDTO board=boardService.getBoardBySeq(no);
		List<CommentDTO> comments=commentService.getComments(no);
		
		model.addAttribute("board", board);
		
		if(comments!=null) {
			model.addAttribute("comment",comments);
		}
		
		return "boardContent";
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
