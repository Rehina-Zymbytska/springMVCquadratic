<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22.05.2019
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>

<h3>Будьласка введіть коефіціети</h3>

<form action="/saveCoeficientsToDB" method="post">
    <input type="number" name="a" placeholder="a" required>
    <input type="number" name="b" placeholder="b" required>
    <input type="number" name="c" placeholder="c" required>
    <input type="submit" value="Розрахувати">
</form>

<p>a - ${a}</p>
<p>b - ${b}</p>
<p>c - ${c}</p>



<p>discriminant - ${discriminant}</p>

<p>${message}</p>

<p>squareRoot1 - ${SquareRoot1}</p>
<p>squareRoot2 - ${SquareRoot2}</p>

</body>
</html>
