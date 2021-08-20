<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
	<title>用户信息显示</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="<%=request.getContextPath()%>/js/jquery-3.2.1.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>

	<%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>

</head>
<body>
	<!-- 顶栏 -->
	<jsp:include page="top.jsp"></jsp:include>
	<!-- 中间主体 -->
	<div class="container" id="content">
		<div class="row">
			<jsp:include page="menu.jsp"></jsp:include>
			<div class="col-md-10">
				<div class="panel panel-default">
				    <div class="panel-heading">
						<div class="row">
					    	<h1 class="col-md-5">用户列表管理</h1>
							<form class="bs-example bs-example-form col-md-5" role="form" style="margin: 20px 0 10px 0;" action="<%=request.getContextPath()%>/admin/selectStudent" id="form1" method="post">
							</form>
							<button class="btn btn-default col-md-2" style="margin-top: 20px" onClick="location.href='<%=request.getContextPath()%>/admin/toAddStudent'">
								添加用户信息
								<sapn class="glyphicon glyphicon-plus"/>
							</button>

						</div>
				    </div>
				    <table class="table table-bordered">
					        <thead>
					            <tr>
					                <th>id</th>
				  					<th>用户名</th>
				  					<th>密码</th>
				  					<th>所属类别</th>
				  					<th>操作</th>
					            </tr>
					        </thead>
					        <tbody>
							<c:forEach  items="${studentList}" var="item">
								<tr>
									<td>${item.userID}</td>
									<td>${item.userName}</td>
									<td>${item.password}</td>
									<td>${item.role}</td>
									<td>
<%--										<button class="btn btn-default btn-xs btn-info" onClick="location.href='<%=request.getContextPath()%>/admin/toeditStudent?id=${item.userID}'">修改</button>--%>
										<button class="btn btn-default btn-xs btn-danger btn-primary" onClick="location.href='<%=request.getContextPath()%>/admin/removeStudent?id=${item.userID}'">删除</button>
										<!--弹出框-->
									</td>
								</tr>
							</c:forEach>
					        </tbody>
				    </table>

				</div>

			</div>
		</div>
	</div>
</body>
</html>