<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
</head>
<body>
	<h1>logout.jsp페이지</h1>
	
	<%String test = (String)request.getAttribute("logout"); %>
	request 결과값: <%=test %><br>
	
	el 표기법: ${logout }<br>
	<a href="login">login.jsp로 이동</a><br>
	<a href="/">home.jsp로 이동</a>
</body>
</html>