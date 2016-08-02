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
  </head>
  <body>
  <div id="searchContainer">
    <form id="searchForm" action="SearchServlet" method="GET">
      <label for="searchbox">Search</label>
      <input id="searchbox" name="query" type="text"/>
      <br>
      <br>
      <label for="start">Start with</label>
      <input id="start" name="start" type="number"/>
      <br>
      <br>
      <label for="end">End with</label>
      <input id="end" name="end" type="number"/>
      <br>
      <br>
      <button id="searchbutton" type="submit" value="search">Suche</button>
    </form>
    <form action="BrowseServlet" method="GET">
      <input id="paragraph" name="paragraph" type="hidden" value="">
      <button id="browsebutton" type="submit" value="browse">Browse</button>
    </form>
  </div>
  </body>
</html>
