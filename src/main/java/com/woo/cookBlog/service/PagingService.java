package com.woo.cookBlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woo.cookBlog.DTO.PagingDTO;
import com.woo.cookBlog.mapper.PagingMapper;

@Service
public class PagingService {

	@Autowired
	private PagingMapper mapper;
	
	public PagingDTO getPagingDTO(int no,int pageSize) {
		PagingDTO pagingDTO=new PagingDTO();
		
		pagingDTO.setNowPage(no);
		pagingDTO.setPageSize(pageSize);
		
		int start=1;
		
		while(!(start<=no && start+pageSize-1>=no)) {
			start+=5;
		}
		
		pagingDTO.setStart(start);
		pagingDTO.setEnd(start+pageSize-1);
		
		Integer num=mapper.getNumOfBoard((start-1)*10,(pageSize)*10);
		if(num==null) {
			num=0;
		}
		
		
		
		pagingDTO.setNumOfBoards(num);
		
		
		
		return pagingDTO;
	}
}
