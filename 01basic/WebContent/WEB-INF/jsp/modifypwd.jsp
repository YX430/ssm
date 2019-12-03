<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>modify your password</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/partymember/modify.action" method="post">
		userid<input type="text" name="login-userid"> 
		oldpassword<input type="text" name="old_password"> 
		newpassword<input type="text" name="new_password"> 
		<input type="submit" value="modify">
	</form>
</body>
</html>