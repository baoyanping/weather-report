<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<title></title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="<%=request.getContextPath()%>/js/jquery-3.2.1.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
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
					    	<h1 style="text-align: center;">添加用户信息</h1>
						</div>
				    </div>
				    <div class="panel-body">
						<form class="form-horizontal" role="form" action="<%=request.getContextPath()%>/admin/addStudent" id="editfrom" method="post">
							  <div class="form-group">
							    <label for="inputEmail3" class="col-sm-2 control-label">编号</label>
							    <div class="col-sm-10">
							      <input type="number" class="form-control" id="inputEmail3" name="userid" placeholder="请输入id"
								  <c:if test='${student!=null}'>
										 value="${student.userID}"
								  </c:if>>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">姓名</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="userName" placeholder="请输入姓名"
								  <c:if test='${student!=null}'>
										 value="${student.userName}"
								  </c:if>>
							    </div>
							  </div>
							<div class="form-group">
								<label for="inputPassword4" class="col-sm-2 control-label">密码</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputPassword4" name="password" placeholder="请输入密码"
									<c:if test='${student!=null}'>
										   value="${student.password}"
									</c:if>>
								</div>
							</div>

							<div class="form-group">
								<label for="inputPassword4" class="col-sm-2 control-label">所属类别</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputPassword" name="role" placeholder="请输入所属类别"
									<c:if test='${student!=null}'>
										   value="${student.role}"
									</c:if>>
								</div>
							</div>
							  <div class="form-group" style="text-align: center">
								<button class="btn btn-default" type="submit">提交</button>
								<button class="btn btn-default" type="reset">重置</button>
							  </div>
						</form>
				    </div>
				    
				</div>

			</div>
		</div>
	</div>
	<div class="container" id="footer">
	<div class="row">
		<div class="col-md-12"></div>
	</div>
	</div>
</body>
	<script type="text/javascript">
		$("#nav li:nth-child(2)").addClass("active")
	</script>
</html>