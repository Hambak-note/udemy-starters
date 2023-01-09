<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-01-09
  Time: 오후 8:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" errorPage="e.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% String menu[] = {"회원관리", "게시판관리", "쇼핑몰관리", "챗본관리"};
  int index = Integer.parseInt(request.getParameter("menu"));
  %>
<h1> 선택한 메뉴 이름 = <%=menu[index]%></h1>
</body>
</html>

