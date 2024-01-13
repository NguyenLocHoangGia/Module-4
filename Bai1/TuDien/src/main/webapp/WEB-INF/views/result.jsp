<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Dictionary Result</title>
</head>
<body>
<c:if test="${notFound}">
  <p>Word not found in the dictionary.</p>
</c:if>
<c:if test="${result ne null}">
  <p>Meaning: ${result}</p>
</c:if>
<a href="/dictionary">Back to Home</a>
</body>
</html>
