<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-01-09
  Time: 오후 8:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
pageEncoding="UTF-8" errorPage="e.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  request.setAttribute("file", request.getRequestURI());
  int num = Integer.parseInt(request.getParameter("num"));//오류 발생 - forwared
%>
<h1>결과=<%=num%></h1>

</body>
</html>
