<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/partymember/check.action" method="post">
		userid<input type="text" name="login-userid"> 
		<input type="submit" value="search">
	</form>
</body>
</html>