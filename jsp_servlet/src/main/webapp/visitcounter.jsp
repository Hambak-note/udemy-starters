<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-01-09
  Time: 오후 7:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
  int count = 0;
  //서버 시작후 최초 요청
  if (application.getAttribute("count") == null) {
    count = 1;
  }
  else {//서버 시작 후 2번째 이후 요청
    count = (Integer) application.getAttribute("count") + 1;
  }
  application.setAttribute("count", count);
%>
<h1>서버 시작후 <%=count%>번째 방문자입니다.</h1>

</body>
</html>
