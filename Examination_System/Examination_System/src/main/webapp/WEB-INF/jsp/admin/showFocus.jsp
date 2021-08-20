<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
	<title>新闻展示</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
					    	<h1 class="col-md-5">新闻管理</h1>
							<form class="bs-example bs-example-form col-md-5" role="form" style="margin: 20px 0 10px 0;" action="<%=request.getContextPath()%>/admin/selectKnows" id="form1" method="post">
								<div class="input-group">
									<input type="text" class="form-control" placeholder="请输入编号" name="findById">
									<span class="input-group-addon btn" onclick="document.getElementById('form1').submit" id="sub">搜索</span>
								</div>
							</form>
							<button class="btn btn-default col-md-2" style="margin-top: 20px" onClick="location.href='<%=request.getContextPath()%>/admin/toAddFocus'">
								添加信息
								<sapn class="glyphicon glyphicon-plus"/>
							</button>

						</div>
				    </div>
				    <table class="table table-bordered">
					        <thead>
					            <tr>
					                <th>编号</th>
				  					<th>标题</th>
				  					<th>内容</th>
				  					<th>发布日期</th>
									<th>发布时间</th>
									<th>发布作者</th>
					            </tr>
					        </thead>
					        <tbody>
							<c:forEach  items="${focusList}" var="item">
								<tr>
									<td>${item.id}</td>
									<td>${item.title}</td>
									<td>${item.content}</td>
									<td>${item.publishdate}</td>
									<td>${item.publishtime}</td>
									<td>${item.publishman}</td>
									<td>
										<button class="btn btn-default btn-xs btn-info" onClick="location.href='<%=request.getContextPath()%>/admin/toUpdateFocus?id=${item.id}'">修改</button>
										<button class="btn btn-default btn-xs btn-danger btn-primary" onClick="location.href='<%=request.getContextPath()%>/admin/toRemoveFocus?id=${item.id}'">删除</button>
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
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="<%=request.getContextPath()%>/js/jquery-3.2.1.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>

	<%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>

</head>
<body>
<!-- 顶栏 -->

<!-- 中间主体 -->

<%--<html>--%>
<%--<head>--%>

<%--	<meta name="viewport" content="width=device-width, initial-scale=1.0">--%>
<%--	<meta name="renderer" content="webkit">--%>
<%--	<meta http-equiv="X-UA-Compatible" content="IE=edge">--%>
<%--	<!-- 引入bootstrap -->--%>
<%--	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">--%>
<%--	<!-- 引入JQuery  bootstrap.js-->--%>
<%--	<script src="<%=request.getContextPath()%>/js/jquery-3.2.1.min.js"></script>--%>
<%--	<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>--%>

<%--	&lt;%&ndash;<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">&ndash;%&gt;--%>

<%--</head>--%>
<%--<body>--%>
<%--<!-- 顶栏 -->--%>

<%--<!-- 中间主体 -->--%>
<%--<div class="container" id="content1">--%>
<%--	<div class="row">--%>
<%--		<div class="col-md-10">--%>
<%--			<div class="panel panel-default">--%>
<%--				<div class="panel-heading">--%>
<%--					<div class="row">--%>
<%--						<h1 class="col-md-5">热点天气管理</h1>--%>
<%--						<button class="btn btn-default col-md-2" style="margin-top: 20px" onClick="location.href='<%=request.getContextPath()%>/admin/toAddHots'">--%>
<%--							添加信息--%>
<%--							<sapn class="glyphicon glyphicon-plus"/>--%>
<%--						</button>--%>

<%--					</div>--%>
<%--				</div>--%>

<%--				<table class="table table-bordered">--%>
<%--					<thead>--%>
<%--					<tr>--%>
<%--						<th>编号</th>--%>
<%--						<th>标题</th>--%>
<%--						<th>内容</th>--%>
<%--						<th>发布日期</th>--%>
<%--						<th>发布时间</th>--%>
<%--						<th>发布作者</th>--%>
<%--					</tr>--%>
<%--					</thead>--%>

<%--					<tbody>--%>
<%--					<c:forEach  items="${hotsList}" var="item">--%>
<%--						<tr>--%>
<%--							<td>${item.id}</td>--%>
<%--							<td>${item.title}</td>--%>
<%--							<td>${item.content}</td>--%>
<%--							<td>${item.publishdate}</td>--%>
<%--							<td>${item.publishtime}</td>--%>
<%--							<td>${item.publishman}</td>--%>
<%--							<td>--%>

<%--							<button class="btn btn-default btn-xs btn-info" onClick="location.href='<%=request.getContextPath()%>/admin/toUpdateHots?id=${item.id}'">修改</button>--%>
<%--								<button class="btn btn-default btn-xs btn-danger btn-primary" onClick="location.href='<%=request.getContextPath()%>/admin/toRemoveHots?id=${item.id}'">删除</button>--%>
<%--								<!--弹出框-->--%>
<%--							</td>--%>
<%--						</tr>--%>
<%--					</c:forEach>--%>

<%--					</tbody>--%>
<%--				</table>--%>

<%--			</div>--%>
<%--		</div>--%>
<%--	</div>--%>
<%--</div>--%>
<%--</body>--%>

<%--</html>--%>
