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
<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
</head>
<body>
<div class="alert alert-success fs-2" role="alert">
<i class="bi bi-patch-check-fill me-2"></i>Success!
</div>
<table class="table container">
<thead>
<tr class="table-dark">
<th scope="col">Id</th>
<th scope="col">User Name</th>
<th scope="col">Email</th>
<th scope="col">Phone No</th>
<th scope="col">Address</th>
</tr>
</thead>
<tbody>
<tr>
<th class="table-secondary" scope="row">1</th>
<td class="table-secondary">${dto.userName}</td>
<td class="table-secondary">${dto.emailId}</td>
<td class="table-secondary">${dto.phoneNumber}</td>
<td class="table-secondary">${dto.address}</td>
</tr>
</tbody>
</table>
</body>
</html>