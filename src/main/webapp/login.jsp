<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Here</title>
</head>
<body>

	<h3>Login User</h3>

	<form action="LoginServlet" method="post">
		<table cellpadding="2" cellspacing="2">
			<tr>
				<td>E-mail</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="Password"></td>
			</tr>

			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Submit"></td>
			</tr>

		</table>
	</form>
	<h4>New Here...</h4>
	<a href="registration.jsp">Sign Up</a>
</body>
</html>