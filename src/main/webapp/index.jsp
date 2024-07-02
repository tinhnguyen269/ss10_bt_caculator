<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<h1>Simple Caculator</h1>
<form action="/caculator" method="post" >
    <label for="first">First operand:</label>
    <input type="number" id="first" name="firstOperand"><br><br>
    <label for="operator">Operator:</label>
    <select name="operator" id="operator">
        <option value="+">add</option>
        <option value="-">sub</option>
        <option value="*">mul</option>
        <option value="/">div</option>
    </select> <br><br>
    <label for="second">Second operand:</label>
    <input type="number" id="second" name="secondOperand"><br><br>
    <input type="submit" name="Caculate">
</form>
</body>
</html>