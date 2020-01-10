<%@ page import="java.util.ArrayList" %>
<%@ page import="firstLesson.models.Car" %>
<%@ page import="java.io.CharArrayReader" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>$Title$</title>
</head>
<body style="background-color: beige; margin: 10px; font-size: 16px; font-family: Helvetica">

<%
    ArrayList<Car> allcars = (ArrayList<Car>) request.getAttribute("cars");
    if (allcars != null) {
        for (Car car : allcars) {
%>

<h1 style="position: relative; font-size: 24px"><%=car.getName() + " " + car.getCountry() + " " + car.getPrice()%>
</h1>

<form action="remove" method="get">
    <input type="hidden" name="id" value="<% out.print(car.getId());%>">
    <button>DELETE</button>
</form>
<%
    out.print("<a href = 'detail?id=" + car.getId() + "'>DETAILS</a>");

%>

<%
        }
    }
%>

<form style="position: relative" action="/addCar" method="get">
    <p>name</p> <input type="text" name="name">
    <p>country</p> <input type="text" name="country">
    <p>price</p> <input type="number" name="price">
    <button type="submit">Insert</button>
</form>

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
