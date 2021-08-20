<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
	<title>动态信息显示</title>

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
					    	<h1 class="col-md-5">小知识栏目管理</h1>

							<button class="btn btn-default col-md-2" style="margin-top: 20px" onClick="location.href='<%=request.getContextPath()%>/admin/toAddKnows'">
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
				  					<th>操作</th>
					            </tr>
					        </thead>

					        <tbody>
							<c:forEach  items="${knowList}" var="item">
								<tr>
									<td>${item.id}</td>
									<td>${item.title}</td>
									<td>${item.content}</td>
									<td>
										<button class="btn btn-default btn-xs btn-info" onClick="location.href='<%=request.getContextPath()%>/admin/toUpdateKnows?id=${item.id}'">修改</button>
										<button class="btn btn-default btn-xs btn-danger btn-primary" onClick="location.href='<%=request.getContextPath()%>/admin/toRemoveKnows?id=${item.id}'">删除</button>
										<!--弹出框-->
									</td>
								</tr>
							</c:forEach>

							</tbody>
				    </table>

				</div>
			</div>
</body>

</html>

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
<%--						<h1 class="col-md-5">风险地区管理</h1>--%>
<%--						<button class="btn btn-default col-md-2" style="margin-top: 20px" onClick="location.href='<%=request.getContextPath()%>/admin/toAddRisk'">--%>
<%--							添加信息--%>
<%--							<sapn class="glyphicon glyphicon-plus"/>--%>
<%--						</button>--%>

<%--					</div>--%>
<%--				</div>--%>

<%--				<table class="table table-bordered">--%>
<%--					<thead>--%>
<%--					<tr>--%>
<%--						<th>编号</th>--%>
<%--						<th>高风险</th>--%>
<%--						<th>低风险</th>--%>
<%--						<th>操作</th>--%>
<%--					</tr>--%>
<%--					</thead>--%>

<%--					<tbody>--%>
<%--					<c:forEach  items="${riskList}" var="risk">--%>
<%--						<tr>--%>
<%--							<td>${risk.id}</td>--%>
<%--							<td>${risk.highrisk}</td>--%>
<%--							<td>${risk.lowrisk}</td>--%>
<%--							<td>--%>
<%--								<button class="btn btn-default btn-xs btn-info" onClick="location.href='<%=request.getContextPath()%>/admin/toUpdateRisk?id=${risk.id}'">修改</button>--%>
<%--								<button class="btn btn-default btn-xs btn-danger btn-primary" onClick="location.href='<%=request.getContextPath()%>/admin/toRemoveRisk?id=${risk.id}'">删除</button>--%>
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