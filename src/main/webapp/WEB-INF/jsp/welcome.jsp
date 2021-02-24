<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/styleSheet.css" />
</head>
<body>
<h2>User Registration Form</h2>
	<br>
	<form action='register' method='POST'>
		<label> Enter your Username:  <input type='text' name='username' required></input></label>
		<br>
		<br>
		<label> Enter your Email:     <input type='text' name='email' required></input></label>
		<br>
		<br>
		<label> Enter your Password:  <input type='text' name='password' required></input></label>
		<br>
		<br>
		<input type='submit' value = 'Register'>
	</form>
	<br>
	
	<form action='loginPage' method='POST'>
		<input type='submit' value = 'login'>
	</form>

</body>
</html>