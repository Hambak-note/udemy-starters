<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-01-09
  Time: 오후 7:34
  To change this template use File | Settings | File Templates.
--%>
<%@page import="dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
  <meta charset="UTF-8"/>
    <title>Title</title>
</head>
<body>
<%
  String id = request.getParameter("id");
  String pw = request.getParameter("pw");
  String name = request.getParameter("name");
  MemberDTO dto = new MemberDTO();
  dto.setId(id);
  dto.setPw(pw);
  dto.setName(name);
  out.println("무시");
  RequestDispatcher rd = request.getRequestDispatcher("request2.jsp");
  request.setAttribute("dto", dto);
  rd.forward(request, response);
%>

</body>
</html>
