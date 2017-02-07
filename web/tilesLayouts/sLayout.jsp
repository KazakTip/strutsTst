<%--
  Created by IntelliJ IDEA.
  User: SBT-Kazakov-NO
  Date: 07.02.2017
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
    <title> <tiles:getAsString name="title"/> </title>
</head>
<body>
<table>
    <tr><td> <tiles:insert attribute="header"/> </td></tr>
    <tr><td> <tiles:insert attribute="body"/> </td></tr>
    <tr><td> <tiles:insert attribute="footer"/> </td></tr>
</table>
</body>
</html>
