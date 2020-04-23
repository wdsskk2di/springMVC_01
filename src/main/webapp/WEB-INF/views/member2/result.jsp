<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>넘어온 값</h1>
	name: ${name }<br>
	age: ${age }<br>
	
	<!-- request가 아닌 model로 가져온 값이라 param.name 이런식으로 받아오지 x -->
	<!-- JSP05의 el_scope 참고 -->
	<a href="index">index.jsp 이동</a>
</body>
</html>