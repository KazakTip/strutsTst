<%--
  Created by IntelliJ IDEA.
  User: sbt-kazakov-no
  Date: 03.02.2017
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri ="/tags/sbTld" prefix="conv" %>

<html>
<head>
    <title>JSPSomeBean</title>
</head>
<body>


   <%--

    <jsp:useBean id = "someBean_" class = "beans.SomeBean" />

    Text before setter : "<jsp:getProperty name="someBean_" property="someText" />".

    <jsp:setProperty name="someBean_" property = "someText" value = "New Text 123" />

    Text after setter : "<jsp:getProperty name="someBean_" property="someText" />".

    --%>

    <conv:Convert bitCount = "2323"/>

    <conv:Convert bitCount = "2323" ></conv:Convert>

    <conv:Convert bitCount = "2323" >123</conv:Convert>

</body>
</html>
