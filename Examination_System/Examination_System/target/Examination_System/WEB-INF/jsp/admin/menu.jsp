<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="col-md-2">
    <ul class="nav nav-pills nav-stacked" id="nav">
        <li><a href="<%=request.getContextPath()%>/admin/showLoad">动态管理</a></li>
        <li><a href="<%=request.getContextPath()%>/admin/showStudent">用户管理</a></li>
        <li><a href="<%=request.getContextPath()%>/admin/showKnows">系统管理</a></li>
        <li><a href="<%=request.getContextPath()%>/admin/showFocus">资讯管理</a></li>
        <li><a href="<%=request.getContextPath()%>/admin/userPasswordRest">账号密码重置<sapn class="glyphicon glyphicon-repeat pull-right" /></a></li>
        <li><a href="<%=request.getContextPath()%>/admin/passwordRest">修改密码<sapn class="glyphicon glyphicon-pencil pull-right" /></a></li>
        <li><a href="<%=request.getContextPath()%>/logout">退出系统<sapn class="glyphicon glyphicon-log-out pull-right" /></a></li>
    </ul>
</div>