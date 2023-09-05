<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<%@include file="style.jsp"%>
</head>
<body>
  <%@include file="navbar.jsp"%>
  <div class="container p-2 mt-3 border border-secondary-subtle shadow-lg fw-semibold w-75">
    <h4 class="text-center bg-primary-subtle p-2 border border-primary text-primary">Registration Form</h4>
    <hr>
    <p class="fw-bold">${succmsg}</p>
    <p class="text-danger fw-bold">${errmsg}</p>

    <form action="save" method="post">
      <div class="row">
        <div class="col border-end border-dark-subtle">
          <div class="mb-2">
            <label class="form-label">Name</label> <input type="text" class="form-control" placeholder="Enter name" name="uname" required>
          </div>
          <div class="mb-2">
            <label class="form-label">Email address</label> <input type="email" class="form-control" placeholder="Enter email" name="uemail" required>
          </div>
          <div class="mb-2">
            <label class="form-label">Phone Number</label> <input type="tel" class="form-control" placeholder="Enter Phone +91" name="uphone" required>
          </div>
          <div class="mb-2">
            <label class="form-label">Date of birth</label> <input type="date" class="form-control" max="2006-01-01" name="udob" required>
          </div>
        </div>
        <div class="col">
          <div class="mb-2">
            <label class="form-label">Password</label> <input type="password" class="form-control" placeholder="Enter password" name="upass1" required>
          </div>
          <div class="mb-2">
            <label class="form-label">Confirm Password</label> <input type="password" class="form-control" placeholder="Enter password again" name="upass2" required>
            <p class="text-danger fw-bold">${passerr}</p>
          </div>
          <div class="mb-2">
            <label class="form-label">Passport Office</label> <select class="form-select" aria-label="Default select example" name="passOffice" required>
              <option selected>Choose passport office location</option>
              <option value="bagalkot">Bagalkot</option>
              <option value="ballari">Ballari</option>
              <option value="belagavi">Belagavi</option>
              <option value="bengaluru">Bengaluru</option>
              <option value="bidar">Bidar</option>
              <option value="chamarajanagar">Chamarajanagar</option>
              <option value="chikballapur">Chikballapur</option>
              <option value="chikkamagaluru">Chikkamagaluru</option>
              <option value="chitradurga">Chitradurga</option>
              <option value="dakshina kannada">Dakshina Kannada</option>
              <option value="davanagere">Davanagere</option>
              <option value="dharwad">Dharwad</option>
              <option value="gadag">Gadag</option>
              <option value="hassan">Hassan</option>
              <option value="haveri">Haveri</option>
              <option value="kalaburagi">Kalaburagi</option>
              <option value="kodagu">Kodagu</option>
              <option value="kolar">Kolar</option>
              <option value="koppal">Koppal</option>
              <option value="mandya">Mandya</option>
            </select>
          </div>
          <div class="mb-2">
            <label class="form-label">Aadhaar No</label> <input type="tel" class="form-control" placeholder="Enter aadhaar no" name="uaadh" required>
          </div>
        </div>
      </div>
      <input type="submit" class="btn btn-outline-primary mt-2 w-100 fw-bold rounded-0">
    </form>
  </div>
</body>
</html>