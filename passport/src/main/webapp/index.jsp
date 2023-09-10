<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<%@include file="style.jsp"%>
</head>
<body>
  <%@include file="navbar.jsp"%>
  <div class="row align-items-center m-4 mt-1">
    <div class="col-6">
      <h1 class="text-warning">Traveling</h1>
      <h6>Vision</h6>
      <p class="fst-italic">"To deliver passport services to citizens in a timely, transparent, more accessible, reliable manner and in a comfortable environment through streamlined processes and committed, trained and motivated workforce"</p>
      <a href="register.jsp" class="btn btn-primary fw-bold">Register</a>
    </div>
    <div class="col-6">
      <img src="home.jpg" height="600" width="600">
    </div>
  </div>
</body>
</html>