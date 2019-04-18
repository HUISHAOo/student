<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/16
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updateStus" method="post">
    <input type="hidden" name = "uid" value="${stu.id}">
    用户名:<input type="text" name="user" value="${stu.username}">
    密码:<input type="text" name ="pad"value="${stu.password}">
    <input type="submit" value="提交">
</form>
</body>
</html>
