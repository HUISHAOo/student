<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/15
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>编号</td>
        <td>用户</td>
        <td>密码</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <h1>学生信息表</h1>
<a href="addstu02">新增</a>
    <c:forEach items="${stus}" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.username}</td>
            <td>${stu.password}</td>
            <td>
                <a href="${pageContext.request.contextPath}/deleteStu?uid=${stu.id}"> 删除</a>
                <a href="${pageContext.request.contextPath}/updatestu02?uid=${stu.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
