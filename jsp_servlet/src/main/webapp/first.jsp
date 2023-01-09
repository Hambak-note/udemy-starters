<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-01-09
  Time: 오후 7:06
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.Date"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>spring 회원님 환영합니다</h1>
<%
  String id = request.getParameter("id");
  Date now = new Date();
%>
<h1><%=id%>회원님 <%=now%>시각에 로그인 하셨습니다.</h1>

</body>
</html>
