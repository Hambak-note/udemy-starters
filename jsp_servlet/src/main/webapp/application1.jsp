<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-01-09
  Time: 오후 6:57
  To change this template use File | Settings | File Templates.
--%>
<%@page import="dto.MemberDTO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"
pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Insert title here</title>
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
    //서블릿은 ServletContext application = request.getServletContext();
    application.setAttribute("appdto", dto);
%>
<%="출력"%>

</body>
</html>
