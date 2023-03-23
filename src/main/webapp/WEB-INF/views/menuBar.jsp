<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<c:set var="Login" value="Login"/> 

<c:choose>
<c:when test="${empty  cookie.id.value }">
<div id="header">
    	<div id="logo" style="height:100%; color: black; padding:auto cursor:pointer" onclick="location.href='/cookBlog'" >
        	COOK
        </div>
        <div class="buttons" style="height:100%; float:right;color: black" onclick="location.href='/cookBlog/login'">
        		로그인
        </div>
    </div>
</c:when>
<c:otherwise>
	<div id="header">
    	<div id="logo" style="height:100%; color: black; padding:auto cursor:pointer" onclick="location.href='/cookBlog'" >
        	COOK
        </div>
        <div class="buttons" style="height:100%; float:right;color: black" onclick="location.href='/cookBlog/logout'">
        		로그아웃
        </div>
        <div class="buttons" style="height:100%; float:right; color: black" onclick="location.href='/cookBlog/board/writePage'">
        	레시피 등록
        </div>
        
    </div>
</c:otherwise>
</c:choose>


<div id="menuBar">
	<ul>
		<li><a href="/cookBlog">홈</a></li>
		<li><a href="/cookBlog/board/boardList">게시판</a></li>
		<li><a href="/">내 정보</a></li>
	</ul>


</div>



