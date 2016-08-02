<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Alexey Kurovskiy
  Date: 31.07.2016
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    PrintWriter printWriter = response.getWriter();
    ArrayList<String> html = (ArrayList<String>)session.getAttribute("html");
    for (String string : html)
        printWriter.println(string);
%>
</body>
</html>
