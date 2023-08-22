<%@page import="com.xworkz.stackoverflow.dto.StackDTO"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Result Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
</head>
<body>
  <%@include file="navbar.jsp"%>
  <div class="container mt-3">
    <div class="text-center bg-primary-subtle border border-primary border-bottom-0">
      <h1>Search Result</h1>
    </div>
    <c:if test="${not empty successMsg}">
      <h5 class="text-success text-center fw-bold">
        <i class="bi bi-person-check-fill me-1"></i>${successMsg}
      </h5>
      <c:remove var="successMsg" />
    </c:if>
    <c:if test="${not empty errorMsg}">
      <h5 class="text-center text-danger">
        <i class="bi bi-person-x-fill me-1"></i>${errorMsg}
      </h5>
      <c:remove var="errorMsg" />
    </c:if>
    <table class="table table-sm table-bordered border-dark text-center table-striped shadow-lg">
      <thead>
        <tr class="table-dark table-bordered border-secondary">
          <th scope="col">Id</th>
          <th scope="col">User Name</th>
          <th scope="col">Email</th>
          <th scope="col">Phone</th>
          <th scope="col">Address</th>
          <th scope="col">Followers</th>
          <th scope="col">No. of Ques Answered</th>
          <th scope="col">No. of Ques Asked</th>
          <th scope="col">Badges</th>
          <th scope="col">Skills</th>
          <th scope="col">Member Since</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="dto" items="${sr}">
          <tr>
            <td>${dto.id}</td>
            <td>${dto.name}</td>
            <td>${dto.email}</td>
            <td>${dto.phoneNo}</td>
            <td>${dto.address}</td>
            <td>${dto.followers}</td>
            <td>${dto.noOfQuesAnswered}</td>
            <td>${dto.noOfQuesAsked}</td>
            <td>${dto.badges}</td>
            <td>${dto.skills}</td>
            <td>${dto.memberSince}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</body>
</html>