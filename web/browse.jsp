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
    <style type="text/css">
        table.tftable {font-size:14px;color:#333333;width:50%;border-width: 1px;border-color: #729ea5;border-collapse: collapse;margin: auto;}
        table.tftable th {font-size:14px;background-color:#acc8cc;border-width: 1px;padding: 8px;border-style: solid;border-color: #729ea5;text-align:left;}
        table.tftable tr {background-color:#d4e3e5;}
        table.tftable td {font-size:14px;border-width: 1px;padding: 8px;border-style: solid;border-color: #729ea5;}

        form {
            display: inline-block;
        }

        .textdiv {
            margin: auto;
            width: 700px;
        }

        .center {
            margin: 0;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
        }

        .header {
            height:100px;
            background:#FFFFFF;
            margin:0px auto;
        }

        .css_button {
            font-size: 14px;
            font-weight: normal;
            text-decoration: inherit;
            -webkit-border-radius: 4px 4px 4px 4px;
            -moz-border-radius: 4px 4px 4px 4px;
            border-radius: 4px 4px 4px 4px;
            border: 1px solid #729EA5;
            padding: 8px 32px;
            -webkit-box-shadow: inset 1px 1px 0px 0px #BEE2F9;
            -moz-box-shadow: inset 1px 1px 0px 0px #BEE2F9;
            box-shadow: inset 1px 1px 0px 0px #BEE2F9;
            cursor: pointer;
            color: #333333;
            display: inline-block;
            background: -webkit-linear-gradient(90deg, #729ea5 15%, #d4e3e5 100%);
            background: -moz-linear-gradient(90deg, #729ea5 15%, #d4e3e5 100%);
            background: -ms-linear-gradient(90deg, #729ea5 15%, #d4e3e5 100%);
            background: linear-gradient(180deg, #d4e3e5 15%, #729ea5 100%);
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#d4e3e5", endColorstr="#729ea5");
        }

        .css_button:hover {
            background: -webkit-linear-gradient(90deg, #729ea5 5%, #d4e3e5 90%);
            background: -moz-linear-gradient(90deg, #729ea5 5%, #d4e3e5 90%);
            background: -ms-linear-gradient(90deg, #729ea5 5%, #d4e3e5 90%);
            background: linear-gradient(180deg, #d4e3e5 5%, #729ea5 90%);
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#d4e3e5",endColorstr="#729ea5");
        }

        .css_button:active {
            position:relative;
            top: 1px;
        }
    </style>
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
