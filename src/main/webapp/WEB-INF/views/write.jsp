<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta charset="UTF-8">
    <title>메인페이지</title>
    <link href="${path}/resources/css/index.css" rel="stylesheet" type="text/css">
    <link href="${path}/resources/css/menuBar.css" rel="stylesheet" type="text/css">
    <script src="http://code.jquery.com/jquery-latest.js"></script> 
    <script src="${path}/resources/javascript/summernote-lite.js"></script>
	<script src="${path}/resources/javascript/summernote-ko-KR.js"></script>
	
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
</head>
<body>
    <jsp:include page="menuBar.jsp" />
    
    
    <script type="text/javascript">
    $(document).ready(function() {
    	//여기 아래 부분
    	var fontList = ['맑은 고딕','NotoSansKR'];
    	$('#summernote').summernote({
    		  height: 300,                 // 에디터 높이
    		  minHeight: null,             // 최소 높이
    		  maxHeight: null,             // 최대 높이
    		  focus: true,                  // 에디터 로딩후 포커스를 맞출지 여부
    		  lang: "ko-KR",					// 한글 설정
    		  placeholder: '최대 2048자까지 쓸 수 있습니다',	//placeholder 설정
    		  fontNames: fontList,
              fontNamesIgnoreCheck: fontList
    		  
              
    	});
    });
    </script>
    
    <form method="post">
 		 <textarea id="summernote" name="editordata"></textarea>
 		 <input type="submit" value="등록"/>
	</form>
    
</body>
</html>