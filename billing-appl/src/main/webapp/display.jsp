<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
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
<i class="bi bi-cart-check-fill me-2"></i></i>Thank you, your order has been
placed!
</div>
<table class="table container">
<thead>
<tr class="table-dark">
<th scope="col">Id</th>
<th scope="col">Name</th>
<th scope="col">ItemName</th>
<th scope="col">ItemType</th>
<th scope="col">Qty</th>
<th scope="col">Total Bill</th>
</tr>
</thead>
<tbody>
<tr>
<th scope="row">1</th>
<td>${n}</td>
<td>${in}</td>
<td>${it}</td>
<td>${q}</td>
<td>${tb}</td>
</tr>
</tbody>
</table>
</body>
</html>