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
    <a href="/message/go">跳转</a>
<div>
    用户名：<input type="text" id="userName" name="userName">
            <input type="button" value="查找用户" onclick="Search()">
</div>
    <h2>form————GET</h2>
<div>
    <form id="reportGet" action="/message/report1" method="get">
        Begin：<input type="text" name="begin"><br>
        End：<input type="text" name="end"><br>
        <input type="submit" value="Get查询报表">
    </form>
</div>

    <h2>form————POST</h2>
    <div>
        <form id="reportPost" action="/message/report2" method="post">
            Begin：<input type="text" name="begin"><br>
            End：<input type="text" name="end"><br>
            <input type="submit" value="Post查询报表">
        </form>
    </div>

    <div>
        <form id="zc" action="/user/login" method="post">
            用户名：<input type="text" required id="name" name="name"><br>
            密码：<input type="password" required id="pw" name="pw"><br>
            <input type="submit" value="登录">
            <input type="button" value="注册" onclick="location.href='/user/register'">
        </form>
    </div>
</body>
<script>
    function Search() {
        window.open("/message/detail/data="+document.getElementById("userName").value);
    }

    if ('${status}' != '') {
        if ('${status}' == 0) {
            alert('登录成功,即将跳转至用户详情页！')
            location.href = '/user/userInfo'
        }else if ('${status}' == 1) {
            alert('该账户不存在！');
        }
        else if ('${status}' == 2) {
            alert('密码错误！')
        }
    }
</script>
</html>
