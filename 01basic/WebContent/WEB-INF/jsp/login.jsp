<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<meta name="description" content="manager login page">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>
		<!-- 导入图标css文件 -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
		<!-- 导入默认末班css文件 -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">	
	</head>
	
	<body>
<!-- 		<a id="manager-btn" class="easyui-linkbutton" href="/WEB-INF/jsp/login-manager.jsp">管理员登录</a>	 -->
<!-- 		<a id="member-btn" class="easyui-linkbutton" href="/WEB-INF/jsp/login-member.jsp">普通用户登录</a>	 -->
		<a id="manager-btn" class="easyui-linkbutton" href="${pageContext.request.contextPath}/partymanager/login.action">管理员登录</a>	
		<a id="member-btn" class="easyui-linkbutton" href="${pageContext.request.contextPath}/partymember/login.action">普通用户登录</a>	
	</body>

	<script type="text/javascript">
		<!-- ->
	</script>
</html>
