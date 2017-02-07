<%-- 1)
 При использовании сервера GlassFish может возникнуть проблема развертывания аннотированных сервлетов
 Искать искать ошибки развертывания и другие

 --%>
<%@ page contentType="text/html;charset=UTF-8" %> <!-- что бы кириллица отображалась нормально -->
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html-el" %>

<html>
<head>
    <title>Какой-то сервлет</title>
</head>
<body>

<html:form action="/struts/TstAction">

    <html:radio property="frwSel" value="0"/> Trash       <br/>
    <html:radio property="frwSel" value="1"/> TilesMain   <br/>
    <html:radio property="frwSel" value="2"/> TilesMain2  <br/>
    <%--<input type="submit" value="submit" />--%>

    <%--<p>
        321
        <html:text property="userName" size="20" />
        <html:errors property="userName" />
    </p>
    <p>
        123
        <html:password property="userPswd" size="20" />
        <html:errors property="userPswd" />
    </p>  --%>

    <html:submit>
        Go
    </html:submit>



</html:form>



<%--<Form action="http://localhost:8080/web1_war_exploded/FindBooks/FindMethodPost" method="post">
    <input type=Text name="FindText">
    <input type=Submit value="Найти методом post">
</Form>
<Form action="http://localhost:8080/web1_war_exploded/FindBooks/FindMethodGet" method="get">
    <input type=Text name="FindText">
    <input type=Submit value="Найти методом get">
</Form>

<Form action="http://localhost:8080/web1_war_exploded/hw_cookie">
    <input type=Submit value="Перейти к HelloWorldCookie">
</Form>

<Form action="http://localhost:8080/web1_war_exploded/hw_session">
    <input type=Submit value="Перейти к HelloWorldSession">
</Form>

<Form action="http://localhost:8080/web1_war_exploded/web_xml_deployment">
    <input type=Submit value="Перейти к сервлету развернутому через web.xml">
</Form>

<Form action="http://localhost:8080/web1_war_exploded/JSP_Servlet.jsp">
    <input type=Submit value="Перейти к странице JSP и реализованным для нее обработчиком в сервлете">
</Form>

<Form action="http://localhost:8080/web1_war_exploded/SomeBeanJSP.jsp">
    <input type=Submit value="Перейти к странице JSP SomeBeans">
</Form>

<Form action="http://localhost:8080/web1_war_exploded/SomeBeanJSP.jsp">
    <input type=Submit value="Перейти к странице JSP SomeBeans">
</Form>--%>


</body>
</html>