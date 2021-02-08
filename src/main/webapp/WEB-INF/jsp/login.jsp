<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/2/7
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login">
    用户名：<input type="text" name="username"> <br>
    密码：<input type="password" name="psw"> <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
