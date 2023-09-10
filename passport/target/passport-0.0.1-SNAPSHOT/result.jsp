<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.xworkz.passport.service.PassportService"%>
<%@page import="com.xworkz.passport.service.PassportServiceImpl"%>
<%@page import="com.xworkz.passport.entity.PassportEntity"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
<%@include file="style.jsp"%>
</head>
<body>
  <%@include file="navbar.jsp"%>
  <h1 class="text-center">Result</h1>
  <p class="text-center">${succmsg}</p>
  <p class="text-center">${errmsg}</p>
  <div class="container mt-3">
    <table class="table table-sm table-bordered border-dark text-center table-striped shadow-lg">
      <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Name</th>
          <th scope="col">Email ID</th>
          <th scope="col">DOB</th>
          <th scope="col">Phone</th>
          <th scope="col">Aadhaar</th>
          <th scope="col">Passport Office</th>
          <th scope="col" colspan="2">Actions</th>
        </tr>
      </thead>
      <tbody>
        <%
        PassportService service = new PassportServiceImpl();
        List<PassportEntity> entities = service.getAll();
        for (PassportEntity en : entities) {
        %>
        <tr>
          <td><%=en.getId()%></td>
          <td><%=en.getName()%></td>
          <td><%=en.getEmail()%></td>
          <%
          Date dob = en.getDob();
          SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
          String formatted = dateFormat.format(dob);
          %>
          <td><%=formatted%></td>
          <td><%=en.getPhoneNo()%></td>
          <td><%=en.getAadhaarNo()%></td>
          <td><%=en.getPassportOffice()%></td>
          <td><a href="update.jsp?id=<%=en.getId()%>">Update</a></td>
          <td><a href="delete?id=<%=en.getId()%>">Delete</a></td>
        </tr>
        <%
        }
        %>
      </tbody>
    </table>
  </div>

</body>
</html>