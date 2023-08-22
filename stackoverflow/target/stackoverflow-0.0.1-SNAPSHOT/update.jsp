<%@page import="com.xworkz.stackoverflow.dto.StackDTO"%>
<%@page import="com.xworkz.stackoverflow.service.StackServiceImpl"%>
<%@page import="com.xworkz.stackoverflow.service.StackServiceInter"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
  <%@include file="navbar.jsp"%>
  <div class="w-50 container border border-dark p-2 mt-2 fw-semibold rounded shadow-lg">
    <h4 class="text-center border-bottom border-dark-subtle pb-1">Update Form</h4>
    <%
    int id = Integer.parseInt(request.getParameter("id"));
    StackServiceInter service = new StackServiceImpl();
    StackDTO dto = service.getById(id);
    %>
    <form action="update" method="post">
      <table class="table table-sm">
        <tbody>
          <tr>
            <td><label for="exampleFormControlInput1" class="form-label">Username</label></td>
            <td><input type="text" value="<%=dto.getName()%>" class="form-control form-control-sm border border-dark" id="exampleFormControlInput1" placeholder="Enter Username" name="uname" required></td>
          </tr>
          <tr>
            <td><label for="exampleFormControlInput1" class="form-label">Email</label></td>
            <td><input type="email" value="<%=dto.getEmail()%>" class="form-control form-control-sm border border-dark" id="exampleFormControlInput1" placeholder="Enter Email" name="uemail" required></td>
          </tr>
          <tr>
            <td><label for="exampleFormControlInput1" class="form-label">Phone</label></td>
            <td><input type="tel" value="<%=dto.getPhoneNo()%>" class="form-control form-control-sm border border-dark" id="exampleFormControlInput1" placeholder="Enter PhoneNumber" name="uphno" required></td>
          </tr>
          <tr>
            <td><label for="exampleFormControlInput1" class="form-label">Address</label></td>
            <td><select class="form-select form-select-sm border border-dark" aria-label="Default select example" name="uaddress" required>
                <option selected><%=dto.getAddress()%></option>
                <option value="">Choose Address</option>
                <option value="united states">United States</option>
                <option value="china">China</option>
                <option value="japan">Japan</option>
                <option value="india">India</option>
                <option value="brazil">Brazil</option>
                <option value="russia">Russia</option>
                <option value="germany">Germany</option>
                <option value="united kingdom">United Kingdom</option>
                <option value="france">France</option>
                <option value="italy">Italy</option>
            </select>
          </tr>
          <tr>
            <td><label for="exampleFormControlInput1" class="form-label">Followers</label></td>
            <td><input type="number" value="<%=dto.getFollowers()%>" class="form-control form-control-sm border border-dark" id="exampleFormControlInput1" placeholder="Enter Total Followers" name="ufollowers" required></td>
          </tr>
          <tr>
            <td><label for="exampleFormControlInput1" class="form-label">No. of Ques Answered</label></td>
            <td><input type="number" value="<%=dto.getNoOfQuesAnswered()%>" class="form-control form-control-sm border border-dark" id="exampleFormControlInput1" placeholder="Enter Total Ques Answered" name="uqans" required></td>
          </tr>
          <tr>
            <td><label for="exampleFormControlInput1" class="form-label">No. of Ques Asked</label></td>
            <td><input type="number" value="<%=dto.getNoOfQuesAsked()%>" class="form-control form-control-sm border border-dark" id="exampleFormControlInput1" placeholder="Enter Total Ques Asked" name="uqask" required></td>
          </tr>
          <tr>
            <td><label for="exampleFormControlInput1" class="form-label">Badges</label></td>
            <td><select class="form-select form-select-sm border border-dark" aria-label="Default select example" name="ubadges" required>
                <option selected><%=dto.getBadges()%></option>
                <option value="">Select Badges</option>
                <option value="nice question">Nice Question &diams;</option>
                <option value="good question">Good Question &diams;</option>
                <option value="great question">Great Question &diams;</option>
                <option value="nice answer">Nice Answer &diams;</option>
                <option value="good answer">Good Answer &diams;</option>
                <option value="great answer">Great Answer &diams;</option>
                <option value="popular question">Popular Question &diams;</option>
                <option value="notable question">Notable Question &diams;</option>
                <option value="famous question">Famous Question &diams;</option>
                <option value="popular answer">Popular Answer &diams;</option>
            </select></td>
          </tr>
          <tr>
            <td><label for="exampleFormControlInput1" class="form-label">Skills</label></td>
            <td><select class="form-select form-select-sm border border-dark" aria-label="Default select example" name="uskill" required>
                <option selected><%=dto.getSkills()%></option>
                <option value="">Select Skill</option>
                <option value="python">Python</option>
                <option value="javascript">JavaScript</option>
                <option value="java">Java</option>
                <option value="c">C</option>
                <option value="c++">C++</option>
                <option value="c#">C#</option>
                <option value="ruby">Ruby</option>
                <option value="php">PHP</option>
                <option value="swift">Swift</option>
                <option value="go">Go</option>
            </select></td>
          </tr>
          <tr>
            <td><label for="exampleFormControlInput1" class="form-label">Member Since</label></td>
            <td><input type="date" value="<%=dto.getMemberSince()%>" class="form-control form-control-sm border border-dark" id="exampleFormControlInput1" placeholder="DD-MM-YY" name="umembersince" required></td>
          </tr>
        </tbody>
      </table>
      <input type="hidden" name="id" value="<%=dto.getId()%>"> <input type="submit" class="btn btn-primary col-md-12" value="Update">
    </form>
  </div>
</body>
</html>