<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>管理员登录</title>

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
		<div class="easyui-window" data-options="title:'请您输入管理员账号密码'" style="width:500px;height:150px;padding:10px;background:#fafafa;" 
				data-options="iconCls:'icon-save',closable:true, collapsible:true,minimizable:true,maximizable:true">
			<a id="confirm-btn" class="easyui-linkbutton" href="/WEB-INF/jsp/login-manager.jsp">确认</a>	
		</div>
	</body>

	<script type="text/javascript">
		$('#confirm-btn').linkbutton({
			iconCls: 'icon-save'
		});
	</script>
</html>