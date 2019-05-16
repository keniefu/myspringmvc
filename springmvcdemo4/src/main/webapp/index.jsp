<%--
  Created by IntelliJ IDEA.
  User: Keniefu
  Date: 2019/5/7
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>免费开通人人账号</h1>
<form action="/user/register" method="post" enctype="multipart/form-data">
    注册邮箱：<input type="text" username="email"><br>
    创建密码：<input type="password" username="password"><br>
    真实姓名：<input type="text" username="realname"><br>
    性别：<input type="radio" username="gender" value="male">男 <input type="radio" username="gender" value="female">女<br>
    个人爱好：<input type="checkbox" username="hobby" value="read">读书 <input type="checkbox" username="hobby" value="movie">电影 <input type="checkbox" username="hobby" value="java">java<br>
    生日：<select username="birthday"><c:forEach begin="1930" end="2019" var="y">
    <option value="${y}">${y}</option>
    </c:forEach></select> 年
    <select username="birthday"><c:forEach begin="1" end="12" var="m">
        <option value="${m}">${m}</option>
    </c:forEach></select>月
    <select username="birthday"><c:forEach begin="1" end="31" var="d">
        <option value="${d}">${d}</option>
    </c:forEach></select>日<br>

    我现在:<select username="job">
        <option value="study">正在上学</option>
        <option value="work">正在上班</option>
    </select><br>
    <input type="file" username="headpic"><br>
    <img src="/resources/verycode.gif"> <a href="#">看不清换一张</a><br>
    <input type="text" username="checkcode"><br>
    <img src="/resources/btn_reg.gif" onclick="submit()">
    <script>
        function submit() {
            location.href="${pageContext.request.contextPath}/user/register"
        }
    </script>
</form>
<hr>
<form action="/user/smjb" method="post">
    sname:<input type="text" username="sname"><br>
    tname:<input type="text" username="teacher.tname"><br>
    cname:<input type="text" username="teacher.course.cname"><br>
    <input type="submit">
</form>
<form action="/user/transfer" method="post">
    from:<input type="text" username="from"><br>
    to:<input type="text" username="to"><br>
    money:<input type="text" username="money"><br>
    <input type="submit">
</form>
</body>
</html>
