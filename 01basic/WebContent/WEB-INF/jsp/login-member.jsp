<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>党员用户登录</title>

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
		<div class="easyui-window" data-options="title:'请您输入员账号密码'" style="width:320px;height:150px;
				padding:5px;background:#fafafa;">
			<form class="login-form" action="${pageContext.request.contextPath}/partymember/login_result.action" method="post">
				<table style="text-align:left;width:80%;padding:0;spacing:5;margin:0">
					<tr>
						<td align="right" width="180">用户id：</td>
						<td><input type="text" name="login-userid"></td>
					</tr>
					<tr>
						<td align="right" width="180">密码：</td>
						<td><input type="text" name="login-password"></td>
					</tr>
					<tr>
						<td></td>
						<td align="center"><a id="confirm-btn" onclick="$('.login-form').submit()" class="easyui-linkbutton" type="submit">确认</a>	</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
	
	<script type="text/javascript">
		$('#confirm-btn').linkbutton({
			iconCls: 'icon-save'
		});
	</script>
</html>

