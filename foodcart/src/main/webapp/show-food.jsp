<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="t" %>


<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Food Menu</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h1 {
            text-align: center;
            margin-top: 30px;
            color: #333;
        }

        table {
            margin: 0 auto;
            border-collapse: collapse;
            width: 80%;
            background-color: #fff;
        }

        th, td {
            padding: 15px;
            text-align: center;
        }

        th {
            background-color: #333;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>
    <h1>Menu</h1>
    <table border="1">
        <tr>
            <th>Code</th>
            <th>Item</th>
            <th>Price ($)</th>
        </tr>
     
<t:forEach  var="items" items="${foodItems}">

<tr>
  <td>${items.code}</td>
  <td>${items.item}</td>
  <td>${items.price}</td>
  
</tr>
  <br>
</t:forEach>
    </table>
</body>
</html>
