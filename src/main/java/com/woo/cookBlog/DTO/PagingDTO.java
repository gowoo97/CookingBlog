package com.woo.cookBlog.DTO;


public class PagingDTO {
	private int numOfBoards;
	private int pageSize;
	private int start;
	private int end;
	private int nowPage;
	
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getNumOfBoards() {
		return numOfBoards;
	}
	public void setNumOfBoards(int numOfBoards) {
		this.numOfBoards = numOfBoards;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
}
