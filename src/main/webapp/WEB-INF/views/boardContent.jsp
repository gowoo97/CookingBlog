<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta charset="UTF-8">
    <title>메인페이지</title>
    <link href="${path}/resources/css/index.css" rel="stylesheet" type="text/css">
    <link href="${path}/resources/css/menuBar.css" rel="stylesheet" type="text/css">
    <link href="${path}/resources/css/boardContent.css" rel="stylesheet" type="text/css">
</head>
<body>
    <jsp:include page="menuBar.jsp" />
   	
   	<div class="boardContent">
   		<div class="content">
   			${ board.content }
   		</div>
   	<%
   		String no=request.getParameter("no");
   	%>
   		
   	<div class="comment">
   		<div class="container">
   		<form action="/cookBlog/comment" method="POST">
   			<input type="text" name="comment"/>
   			<input type="hidden" name="no" value="<%=no%>" />
   			<input type="submit"/>
   			
   		</form>
   		</div>
   		
   		<c:forEach var="item" items="${ comment }">
   			<div style="border:1px solid black">
   				<h6>${ item.id }</h6>
   				<p>
   					${ item.comment }
   				</p>
   				
   				<span> ${item.create_date } </span>
   			</div>
   		</c:forEach>
   		
   		
   	</div>
   	</div>
   	
   	
   	
   	
    
</body>
</html>