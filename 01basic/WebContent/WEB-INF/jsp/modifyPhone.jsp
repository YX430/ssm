<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify your password</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/partymember/modifyphone.action" method="post">
		userid<input type="text" name="login-userid"> 
		newPhoneNumber<input type="text" name="new_phoneNumber"> 
		<input type="submit" value="modifyphone">
	</form>
</body>
</html>