<%--
  Created by IntelliJ IDEA.
  User: 437862485@qq.com
  Date: 2019/2/15
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <h2>hello world</h2>
    <a href="/massage/go">跳转</a>
<div>
    用户名：<input type="text" id="userName" name="userName">
            <input type="button" value="查找用户" onclick="Search()">
</div>
    <h2>Get方式的form表单</h2>
<div>
    <form id="reportGet" action="/massage/report" method="get">
        Begin：<input type="text" name="begin"><br>
        End：<input type="text" name="end"><br>
        <input type="submit" value="Get查询报表">
    </form>
</div>
</body>
<script>
    function Search() {
        window.open("/massage/detail/data="+document.getElementById("userName").value);
    }
</script>
</html>
