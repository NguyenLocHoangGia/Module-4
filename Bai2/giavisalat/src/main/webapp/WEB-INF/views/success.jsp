<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HOANG GIA
  Date: 1/13/2024
  Time: 9:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Sandwich have condiment:</h3>
<ul>
    <c:forEach items="${giavi}" var="gv">
        <li>${gv}</li>
    </c:forEach>
</ul>
</body>
</html>
