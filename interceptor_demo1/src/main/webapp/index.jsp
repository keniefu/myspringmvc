<%--
  Created by IntelliJ IDEA.
  User: Keniefu
  Date: 2019/5/9
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>注册页面</h1>
<form action="/register" method="post">
    <input type="text" name="username">
    <input type="password" name="password">
    <input type="text" name="email">
    <input type="submit">
</form>
<hr>
<form action="/import" method="post" enctype="multipart/form-data">
    <input type="file" name="mydata">
    <input type="submit">
</form>
<hr>
<form action="/query" method="post">
<%--    http://localhost/?phone=13800138000&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json--%>
    电话：<input type="text" name="phone">
    appkey：<input type="text" name="appkey" value="10003" readonly>
    sign：<input type="text" name="sign" value="b59bc3ef6191eb9f747dd4e83c99f2a4" readonly>
    format：<input type="text" name="format" value="json" readonly>
    <input type="submit">
</form>
</body>
</html>
