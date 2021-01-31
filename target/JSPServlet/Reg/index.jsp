<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<title>CRUD Operators with Hibernate</title>
</head>
<body>

	<h3>Register User</h3>
	${msg }
	<form  action="/LoginRegistration/RegistrationServlet" method="post">
		<table cellpadding="2" cellspacing="2">
			<!-- <tr>
				<td>Id</td>
				<td><input type="text" name="id"></td>
			</tr> -->
			<tr>
				<td> First Name</td>
				<td><input type="text" name="First Name"></td>
			</tr>
			<tr>
				<td>Middle Name</td>
				<td><input type="text" name="Middle Name"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="Last Name"></td>
			</tr>
			<tr>
				<td>E-mail</td>
				<td><input type="text" name="E-mail"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="Password"></td>
			</tr>
		
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Save"></td>
			</tr>
			
		</table>
	</form>

</body>
</html>