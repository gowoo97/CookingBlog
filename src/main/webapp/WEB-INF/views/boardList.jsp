<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta charset="UTF-8">
    <title>메인페이지</title>
    <link href="${path}/resources/css/index.css" rel="stylesheet" type="text/css">
    <link href="${path}/resources/css/menuBar.css" rel="stylesheet" type="text/css">
</head>
<body>
    <jsp:include page="menuBar.jsp" />
   	
   	<table>
   		<th>게시물 번호</th>
   		<th>작성자</th>
   		<th>제목</th>
   		<th>작성 일시</th>
		<c:forEach var="item" items="${ boards }">
			<tr>
				<td>${item.seq }</td>
				<td>${ item.id } </td>
				<td><a href="/cookBlog/board/boardList/detail?no=${ item.seq }"> ${ item.title }  </a></td>
				<td>${item.create_date }</td>	
			</tr>
		</c:forEach>   	
   	</table>
   	
    
</body>
</html>