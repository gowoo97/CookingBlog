package com.woo.cookBlog.Controller;

import java.sql.Timestamp;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woo.cookBlog.DTO.CommentDTO;
import com.woo.cookBlog.service.CommentService;

@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@PostMapping
	public String write(HttpServletRequest req,HttpServletResponse res,Model model) {
		Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
		String no=req.getParameter("no");
		Cookie cookies[]=req.getCookies();
		String id="";
		for(Cookie co:cookies) {
			if(co.getName().equals("id")) {
				id=co.getValue();
				break;
			}
		}
		
		CommentDTO comment=new CommentDTO();
		comment.setBoard_num(Integer.parseInt(no));
		comment.setId(id);
		comment.setComment(req.getParameter("comment"));
		comment.setCreate_date(currentTimestamp);
		
		commentService.insertComment(comment);
		
		return "redirect:/board/boardList/detail?no="+no;
	}
}
