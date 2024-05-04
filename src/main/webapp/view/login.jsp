<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
body {
    background-image: url(https://i.pinimg.com/originals/77/ea/8a/77ea8ac374225d740173144509c62584.png);
    /* Replace with the correct path to your image file */
   
    background-size: cover; /* You can adjust this based on your needs */
    text-align:;
    margin-top: 202px
}
h1{
	color: blue;
	background-color: red;
	margin-left: 200px;
	margin-right: 200px;

	}
label {
	background-color: yellow;
	font-size: 20px;
}


</style>
</head>
<body>
		<h1>This is Login Page....</h1>

		<form action="logincheck">
			<label>Username :</label>
			<input type="text" name="username" placeholder="Enter UserName Here" required="required"><br><br>
			
			<label>PassWord:</label>
			<input type="password" name="password" placeholder="Enter PassWord Here" required="required"><br><br>
			
			<input type="submit" name="submit" value="LOGIN">
			
		</form>

</body>
</html>