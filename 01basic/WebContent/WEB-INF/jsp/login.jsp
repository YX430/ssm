<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="gb2312">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/partymember/login_result.action" method="post">
		userid<input type="text" name="login-userid"> 
		password<input type="text" name="login-password"> 
		<input type="submit" value="login">
	</form>
</body>
</html>
