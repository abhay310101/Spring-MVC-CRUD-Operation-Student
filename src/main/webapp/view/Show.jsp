<%@page import="com.Data.Model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<script type="text/javascript">
	
		function  deleteStudent()
		{
			alert("You Are Deleting Student");
			document.myForm.action="delete"
			document.myForm.submit();
		}
	
		function editStudent()
		{
			alert("You Are Editing Student")
			document.myForm.action="edit"
			document.myForm.submit();
		}
		
	
	</script>
	<style type="text/css">
	
	body{
	
	color:white;	
	
	background-image:url(https://th.bing.com/th/id/OIP.wk8wkaz0eRXQ3u3meHGlcQHaEK?w=287&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7);
			background-size:100%;
	text-align: center;}
	
	</style>



</head>
<body >
		<h1>This is Show  Page..</h1>
		
			<% List<Student>  list  =(List<Student>)request.getAttribute("data");%>
		
		<form name="myForm">
			
			<table border="2px" align="center">
				 <thead>
				     <tr>
				     	<th>Select</th>
				     	<th>ROllNo</th>
				     	<th>FirstName</th>
				     	<th>LastName</th>
				     	<th>Address</th>
				     	<th>Marks</th>
				     	<th>MobileNo</th>
				     </tr>
				 </thead>
				 
				 <% for(Student  stu :list ) {%>
				 <tbody>
				 	    <tr>
				 	    	<td><input type="radio" name="RollNo" value="<%=stu.getRollNo()%>"/></td>
				 	    	<td><%=stu.getRollNo()%></td>
				 	    	<td><%=stu.getFirstname()%></td>
				 	    	<td><%=stu.getLastname()%></td>
				 	    	<td><%=stu.getAddress()%></td>
				 	    	<td><%=stu.getMarks()%></td>
				 	    	<td><%=stu.getMobileNo()%></td>
				 	    </tr>
				 </tbody>
				 <%}%>	
					
				<tfoot>
					<tr>
					<td colspan="7">
						<button onclick="deleteStudent()">DELETE</button>
						<button onclick="editStudent()">EDIT</button>
					</td>
					</tr>
				</tfoot>
					 
				
			</table>

		</form>
		
		
</body>
</html>