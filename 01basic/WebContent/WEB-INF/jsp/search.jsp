<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="gb2312">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/partymember/check.action" method="post">
		userid<input type="text" name="login-userid"> 
		<input type="submit" value="search">
	</form>
</body>
</html>