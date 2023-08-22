<%@page import="com.xworkz.stackoverflow.service.StackServiceImpl"%>
<%@page import="com.xworkz.stackoverflow.service.StackServiceInter"%>
<%@page import="com.xworkz.stackoverflow.dto.StackDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.xworkz.stackoverflow.utils.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
</head>
<body>
  <%@include file="navbar.jsp"%>
  <div class="container mt-3">
    <div class="text-center bg-primary-subtle border border-primary border-bottom-0">
      <h1>Result</h1>
    </div>
    <c:if test="${not empty successMsg}">
      <h5 class="text-success text-center">
        <i class="bi bi-patch-check-fill me-1"></i>${successMsg}
      </h5>
      <c:remove var="successMsg" />
    </c:if>
    <c:if test="${not empty errorMsg}">
      <h5 class="text-center text-danger">
        <i class="bi bi-exclamation-octagon-fill me-1"></i>${errorMsg}
      </h5>
      <c:remove var="errorMsg" />
    </c:if>
    <table class="table table-sm table-bordered border-dark text-center table-striped shadow-lg" id="dataTable">
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
          <th scope="col">Update</th>
          <th scope="col">Delete</th>
        </tr>
      </thead>
      <tbody>
        <%
        StackServiceInter service = new StackServiceImpl();
        List<StackDTO> dtos = service.getAllDetails();
        for (StackDTO dto : dtos) {
        %>
        <tr>
          <td><%=dto.getId()%></td>
          <td><%=dto.getName()%></td>
          <td><%=dto.getEmail()%></td>
          <td><%=dto.getPhoneNo()%></td>
          <td><%=dto.getAddress()%></td>
          <td><%=dto.getFollowers()%></td>
          <td><%=dto.getNoOfQuesAnswered()%></td>
          <td><%=dto.getNoOfQuesAsked()%></td>
          <td><%=dto.getBadges()%></td>
          <td><%=dto.getSkills()%></td>
          <td><%=dto.getMemberSince()%></td>
          <td><a href="update.jsp?id=<%=dto.getId()%>">Edit</a></td>
          <td><a class="link-danger" href="delete?id=<%=dto.getId()%>">Delete</a></td>
        </tr>
        <%
        }
        %>
      </tbody>
    </table>
  </div>
</body>
</html>