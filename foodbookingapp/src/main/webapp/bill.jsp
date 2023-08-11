<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Page</title>
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
<table class="table container mt-5 fw-medium">
<thead>
<tr class="table-dark">
<th scope="col">No.</th>
<th scope="col">Customer Name</th>
<th scope="col">Food Name</th>
<th scope="col">Food Type</th>
<th scope="col">Qty</th>
<th scope="col">Total Bill</th>
</tr>
</thead>
<tbody>
<tr class="border-bottom border-dark">
<th scope="row">1</th>
<td>${cn}</td>
<td>${fn}</td>
<td>${ft}</td>
<td>${qt}</td>
<td>${tb}</td>
</tr>
</tbody>
</table>
</body>
</html>