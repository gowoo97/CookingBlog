<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인 페이지</title>
<link rel="stylesheet" href="${ path }/resources/css/login.css" >
<link href="${path}/resources/css/menuBar.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%@ include file="menuBar.jsp" %>
	<div id="loginTemplate">
	<form action="/cookBlog/login" method="POST">
		<table>
			<tr>
				<td colspan="2">
					LOGIN
				</td>
			</tr>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>PASSWORD:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit"  value="LOGIN" id="loginBtt" />
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="REGISTER" id="registerBtt" onClick="location.href='/cookBlog/register'"/>
				</td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>