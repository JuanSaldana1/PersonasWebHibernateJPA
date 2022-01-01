<%--
  Created by IntelliJ IDEA.
  User: juanSaldana
  Date: 29/12/2021
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listado de personas</title>
</head>
<body>
<h1>Listado de personas</h1>
<table border="1">
    <caption>Listado de personas</caption>
    <tr>
        <th>Id</th>
        <th>Nombre</th>
        <th>Apellido</th>
        <th>Email</th>
        <th>Teléfono</th>
    </tr>
    <c:forEach var="persona" items="${personas}">
        <tr>
            <td>${persona.idPersona}</td>
            <td>${persona.nombre}</td>
            <td>${persona.apellido}</td>
            <td>${persona.email}</td>
            <td>${persona.telefono}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
