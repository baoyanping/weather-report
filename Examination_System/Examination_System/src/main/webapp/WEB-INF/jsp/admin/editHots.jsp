<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>


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
					    	<h1 style="text-align: center;">修改信息</h1>
						</div>
				    </div>
				    <div class="panel-body">
						<form class="form-horizontal" role="form" action="<%=request.getContextPath()%>/admin/editHots" id="editfrom" method="post">
							  <div class="form-group ">
							    <label for="inputId" class="col-sm-2 control-label" >编号</label>
							    <div class="col-sm-10">
							      <input readonly="readonly" type="number" class="form-control" id="inputId" name="id" placeholder="请输入编号"
								  <c:if test='${hots!=null}'>
										 value="${hots.id}"
								  </c:if>
								  >
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-2 control-label">标题</label>
							    <div class="col-sm-10">
							      <input type="text" class="form-control" id="inputPassword3" name="title" placeholder="请输入标题" value="${hots.title}">
							    </div>
							  </div>
							<div class="form-group">
								<label for="inputPassword1" class="col-sm-2 control-label">内容</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputPassword1" name="content" placeholder="请输入内容" value="${hots.content}">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword2" class="col-sm-2 control-label">发布日期</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputPassword2" name="publishdate" placeholder="请输入内容" value="${hots.publishdate}">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword5" class="col-sm-2 control-label">发布时间</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputPassword5" name="publishtime" placeholder="请输入内容" value="${hots.publishtime}">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword4" class="col-sm-2 control-label">发布作者</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputPassword4" name="publishman" placeholder="请输入内容" value="${v.publishman}">
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

        var collegeSelect = $("#college option");
        for (var i=0; i<collegeSelect.length; i++) {
            if (collegeSelect[i].value == '${student.collegeid}') {
                collegeSelect[i].selected = true;
            }
        }
	</script>
</html>