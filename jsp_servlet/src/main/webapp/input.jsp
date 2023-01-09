<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-01-09
  Time: 오후 7:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<html>
<head>
  <meta charset="UTF-8"/>
    <title>Title</title>
</head>
<body>
<form action="output.jsp">
  시작단:<input type="text" name="start" value="2"><br>
  종료단:<input type="text" name="end" value="9"/><br>
  관리자아이디:<input type="text" name="id" value=<%=request.getParameter("id")%>><br>
  <input type="submit" value="구구단출력"/><br>
</form>

</body>
</html>
