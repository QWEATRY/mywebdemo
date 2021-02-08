<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/2/8
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>创建用户</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/book/addBook" method="post">
    <div class="form-group">
        <label>用户名</label>
        <input type="text" name="userName" class="form-control" placeholder="bookName" required>
    </div>
    <div class="form-group">
        <label>密码</label>
        <input type="password" name="userPassword" class="form-control" placeholder="bookCount" required>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
</form>
</body>
</html>
