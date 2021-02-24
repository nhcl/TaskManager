<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/styleSheet.css" />
</head>
<body>
<form action='login' method='POST'>
		<label> Enter your Username: <input type='text' name='username' required></input></label>
		<br> 
		<br> 
		<label> Enter your Password: <input type='text' name='password' required></input></label> 
		<br> 
		<br> 
		<input type='submit' value='Login'>
	</form>
	<br>
	${error}

</body>
</html>