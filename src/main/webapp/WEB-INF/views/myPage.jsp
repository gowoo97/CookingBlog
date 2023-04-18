<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta charset="UTF-8">
    <title>메인페이지</title>
    <link href="${path}/resources/css/index.css" rel="stylesheet" type="text/css" />
    <link href="${path}/resources/css/menuBar.css" rel="stylesheet" type="text/css" />
    <link href="${path}/resources/css/mypage.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <jsp:include page="menuBar.jsp" />
   	
   	
   	<div id="container">
   		<div id="category">
   			<ul>
   				<li>프로필</li>
   				<li>개인정보</li>
   				<li>친구목록</li>
   			</ul>
   		</div>
   		
   		<div id="content">
   		
   		</div>
   	</div>
   	
    
</body>
</html>