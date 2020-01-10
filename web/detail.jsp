<%@ page import="firstLesson.models.Car" %><%--
  Created by IntelliJ IDEA.
  User: Alexey.Dartau
  Date: 09.01.2020
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>detail</title>
</head>
<body>

<%
    Car car = (Car) request.getAttribute("car");


%>
<h1 style="position: relative; font-size: 100px; margin: 30px; font-size: 16px; font-family: Helvetica"><%
    out.print(car.getName());

%></h1>

<form style="margin: 10px; font-size: 16px; font-family: Helvetica" action="update" method="get">
    <input type="hidden" name="id" value="<%out.print(car.getId());%>">
    <input type="text" name="name" value="<%out.print(car.getName());%>">
    <button>update</button>
</form>

<a style="position: relative; font-size: 12px; margin: 30px; font-size: 16px; font-family: Helvetica"
   class="btn btn-primary" href="/" role="button">Home</a>
</body>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>


</html>
