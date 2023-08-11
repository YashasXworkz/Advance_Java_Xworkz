<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Distance Result Page</title>
<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
crossorigin="anonymous">
</head>
<body>
<table class="table">
<thead>
<tr>
<th scope="col">From</th>
<th scope="col">To</th>
<th scope="col">Distance (k.m)</th>
</tr>
</thead>
<tbody>
<tr>
<td>${st}</td>
<td>${en}</td>
<td>${di}</td>
</tr>
</tbody>
</table>
</body>
</html>