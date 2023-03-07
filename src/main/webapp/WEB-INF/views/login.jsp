<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인 페이지</title>
<link rel="stylesheet" href="${ path }/resources/css/login.css" >
</head>
<body>
	<div id="menuBar">
    	<div id="logo" style="height:100%; color: white; padding:auto">
        	COOK
        </div>
        <div id="buttons" style="height:100%; color: white">
        		LogIn
        </div>
    </div>
	<div id="loginTemplate">
	<form action="">
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
					<input type="submit"  value="LOGIN" id="loginBtt"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="REGISTER" id="registerBtt" />
				</td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>