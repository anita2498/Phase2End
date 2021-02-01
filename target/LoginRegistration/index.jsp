<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <div align="center">
	<h3>Sign in</h3>
	${msg} 
	<form action="LoginServlet" method="post">
		<table cellpadding="2" cellspacing="2">
			<tr>
				<td>E-mail</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password"  name="Password"></td>
			</tr>

			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Submit"></td>
			</tr>

		</table>
	</form>
	<h4>New Here...</h4>
	<a href="registration.jsp">Sign Up</a>
	</div>
</body>
</html>