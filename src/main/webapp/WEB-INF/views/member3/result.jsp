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
	name: ${mem.name }<br>
	age: ${mem.getAge() }<br>
	addr: ${mem.addr }<br>

	<!-- mem.age 또는  mem.getAge() 둘 다 된다. 상관 없이 사용 가능 -->

</body>
</html>