<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-01-09
  Time: 오후 7:36
  To change this template use File | Settings | File Templates.
--%>
<%@page import="dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  MemberDTO dto = (MemberDTO) request.getAttribute("dto");
%>
전달아이디:<H1><%=dto.getId()%></H1>
암호:<H1><%=dto.getPw()%></H1>
이름:<H1><%=dto.getName()%></H1>
</body>
</html>
