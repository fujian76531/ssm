<%--
  Created by IntelliJ IDEA.
  User: 437862485@qq.com
  Date: 2019/2/20
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人中心</title>
</head>
<body>
<div>
    <c:if test="${not empty user}">
    <div>欢迎您，${user.name}${user.sex?'女士':'先生'}             <a href="/user/logout">注销</a></div></div>
</c:if>
<c:if test="${ empty user}">
    对不起，请先<a href="/user/login">登录</a>
</c:if>
</div>
</body>
</html>
