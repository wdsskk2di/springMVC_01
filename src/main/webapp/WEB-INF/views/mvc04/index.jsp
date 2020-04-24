<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="result03">	<!-- result03을 부르면 컨트롤러에서 자동으로  mvc_ex04/result03를 찾아감-->
							<!-- mvc_ex04/result03라고 써버리면 컨트롤러는 mvc_ex04/mvc_ex04/result03를 찾으려함 -->
	ID: <input type="text" name="id" placeholder="아이디"><br>
	PWD: <input type="text" name="pwd" placeholder="비밀번호"><br>
	<input type="submit" value="전송"><br>	
</form>

</body>
</html>