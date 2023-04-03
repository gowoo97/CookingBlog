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
   		
   	<div class="comment">
   		<div class="container">
   			<input type="text"/>
   			<input type="submit"/>
   		</div>
   	</div>
   	</div>
   	
   	
   	
   	
    
</body>
</html>