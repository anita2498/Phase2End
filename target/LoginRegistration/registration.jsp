<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
<div align="center">
	<h3>Register User</h3>
	${msg }
	<form  action="RegistrationServlet" method="post">
		<table cellpadding="2" cellspacing="2">
			<!-- <tr>
				<td>Id</td>
				<td><input type="text" name="id"></td>
			</tr> -->
			<tr>
				<td> First Name</td>
				<td><input type="text" name="First_Name" ></td>
			</tr>
			<tr>
				<td>Middle Name</td>
				<td><input type="text" name="Middle_Name" ></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="Last_Name" ></td>
			</tr>
			<tr>
				<td>E-mail</td>
				<td><input type="text" name="E-mail" ></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="Password" ></td>
			</tr>
		
		
		
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Submit"></td>
			</tr>
			
		</table>
	</form>
<h4>Already have an account?</h4>
		<a href="index.jsp">Log In Here</a>
</div>
</body>
</html>