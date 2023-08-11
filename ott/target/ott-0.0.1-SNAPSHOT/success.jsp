<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
rel="stylesheet"
integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
crossorigin="anonymous">
</head>
<body>
<h1>Success Page!</h1>
<table class="table">
<thead>
<tr>
<th scope="col">Id</th>
<th scope="col">First</th>
<th scope="col">Email</th>
<th scope="col">Phone No</th>
<th scope="col">Address</th>
</tr>
</thead>
<tbody>
<tr>
<th scope="row">1</th>
<td>${dto.userName}</td>
<td>${dto.emailId}</td>
<td>${dto.phoneNumber}</td>
<td>${dto.address}</td>
</tr>
</tbody>
</table>
</body>
</html>