<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary Home</title>
</head>
<body>
<h2>Dictionary Search</h2>
<form action="/dictionary/search" method="post">
    Enter word: <input type="text" name="searchWord" required>
    <input type="submit" value="Search">
</form>
</body>
</html>