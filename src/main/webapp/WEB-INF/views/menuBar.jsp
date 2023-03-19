<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<c:set var="Login" value="Login"/> 

<c:choose>
<c:when test="${empty  cookie.id.value }">
<div id="menuBar">
    	<div id="logo" style="height:100%; color: white; padding:auto cursor:pointer" onclick="location.href='/cookBlog'" >
        	COOK
        </div>
        <div id="buttons" style="height:100%; color: white" onclick="location.href='/cookBlog/login'">
        		Login
        </div>
    </div>
</c:when>
<c:otherwise>
	<div id="menuBar">
    	<div id="logo" style="height:100%; color: white; padding:auto cursor:pointer" onclick="location.href='/cookBlog'" >
        	COOK
        </div>
        <div id="buttons" style="height:100%; color: white" onclick="location.href='/cookBlog/logout'">
        		Logout
        </div>
    </div>
</c:otherwise>
</c:choose>