<%--
  Created by IntelliJ IDEA.
  User: alexe
  Date: 15.05.2016
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Datenschutzgesetz</title>
    <style type="text/css">
      label {
        font: normal 14px Arial !important;
      }

      form {
        display: inline-block;
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
        margin:5px auto;
      }

    .searchtextox {
      width: 600px;
      height: 32px;
      border: solid 2px #729ea5;
      padding: 2px;
      border-radius: 5px;
      font-size: 14px;
      background-color: #FFFFFF;
      outline: none;
      color: #333333;
    }

      .paragraphtextox {
        width: 100px;
        height: 32px;
        border: solid 2px #729ea5;
        padding: 2px;
        border-radius: 5px;
        font-size: 14px;
        background-color: #FFFFFF;
        outline: none;
        color: #333333;
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
  <div class="header">
    <form action="/" method="GET">
      <button id="homebutton" type="submit" class="css_button" value="home">Homepage</button>
    </form>
    <form action="BrowseServlet" method="GET">
      <input id="paragraph" name="paragraph" type="hidden" value="">
      <button id="browsebutton" type="submit" class="css_button" value="browse">Dokument</button>
    </form>
  </div>
  <div id="searchContainer" class="center">
    <form id="searchForm" action="SearchServlet" method="GET">
      <input id="searchbox" name="query" class="searchtextox" type="text"/>
      <button id="searchbutton" type="submit" class="css_button" value="search">Suche</button>
      <br>
      <br>
      <br>
      <label id="paragraphlabel" for="start">Paragraphen:</label>
      <input id="start" name="start" class="paragraphtextox" type="number" placeholder="Von"/>
      <input id="end" name="end" class="paragraphtextox" type="number" placeholder="Bis"/>
    </form>
  </div>
  </body>
</html>
