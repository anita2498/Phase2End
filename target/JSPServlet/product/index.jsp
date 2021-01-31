<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<title>CRUD Operators with Hibernate</title>
</head>
<body>

	<h3>Insert Product</h3>
	${msg }
	<form  action="/JSPServlet/ProductServlet" method="post">
		<table cellpadding="2" cellspacing="2">
			<!-- <tr>
				<td>Id</td>
				<td><input type="text" name="id"></td>
			</tr> -->
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><input type="text" name="quantity"></td>
			</tr>
			<tr>
				<td>Status</td>
				<td><input type="checkbox" name="status"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form>

</body>
</html>