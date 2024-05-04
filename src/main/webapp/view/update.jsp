<%@page import="com.Data.Model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>This is Update Page.</h1>
		
		<% Student  stu =(Student)request.getAttribute("student");%>
		
		
		<form action="update" method="post">
		
		
		<input type="hidden" name="RollNo" value="<%=stu.getRollNo()%>">
		
		
		
		<label>Student FirstName :</label>
		<input type="text" name="Firstname" value="<%=stu.getFirstname()%>" placeholder="Enter Student FirstName"><br>
		
		<label>Student LastName :</label>
		<input type="text" name="Lastname" value="<%=stu.getLastname()%>" placeholder="Enter Student LastName"><br>
		
		<label>Student Address :</label>
		<input type="text" name="Address" value="<%=stu.getAddress()%>" placeholder="Enter Student Address"><br>
		
		<label>Student MobileNo :</label>
		<input type="text" name="MobileNo" value="<%=stu.getMobileNo()%>" placeholder="Enter Student MobileNo"><br>
		
		<label>Student Marks :</label>
		<input type="text" name="Marks" value="<%=stu.getMarks()%>" placeholder="Enter Student Marks"><br>
		
		<input type="submit" value="UPDATE">
		</form>
		
		

</body>
</html>