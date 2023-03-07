<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta charset="UTF-8">
    <title>메인페이지</title>
    <link href="${path}/resources/css/index.css" rel="stylesheet" type="text/css">
</head>
<body>
    <div id="menuBar">
    	<div id="logo">
        	<span style="height:100%; color: white; padding:auto">
            	COOK
        	</span>
        </div>
        <div id="buttons">
        	<span style="height:100%; color: white">
        		LogIn
        	</span>
        </div>
    </div>
    <div id="banner">
    	<img id="mainImg"  src="${ path }/resources/img/cook.jpg"/>
    	<h1 id="title">Share your recipe</h1>
    </div>
    
</body>
</html>