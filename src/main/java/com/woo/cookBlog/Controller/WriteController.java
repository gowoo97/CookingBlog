package com.woo.cookBlog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/write")
public class WriteController {
	
	@GetMapping
	public String enrollPage() {
		return "write";
	}
	
}
