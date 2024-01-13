<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>

<h2>Simple Calculator</h2>

<form action="/calculate" method="post">
    <label for="num1">Number 1:</label>
    <input type="number" name="num1" id="num1" required><br>

    <label for="num2">Number 2:</label>
    <input type="number" name="num2" id="num2" required><br>

    <label for="operation">Operation:</label>
    <select name="operation" id="operation">
        <option value="add">Add</option>
        <option value="subtract">Subtract</option>
        <option value="multiply">Multiply</option>
        <option value="divide">Divide</option>
    </select><br>

    <input type="submit" value="Calculate">
</form>

</body>
</html>
