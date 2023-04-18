package com.woo.cookBlog.mapper;

import org.apache.ibatis.annotations.Param;

public interface PagingMapper {
	public Integer getNumOfBoard(@Param("start") int start,@Param("pageSize") int pageSize);
}
