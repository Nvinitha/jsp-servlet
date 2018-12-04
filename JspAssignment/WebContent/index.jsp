<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="ServletOne">
		<table>
			<tr>
			
				<td>FisrtName<input type="text" name="fname" id="1" required></td>
				<td><div  style="color: red ">${error1}</div></td>
			</tr>
			<tr>
				<td>LastName<input type="text" name="lname" id="3"required></td>
				<td >${error2}</td>
			</tr>
			<tr>
				<td>Address<input type="text" name="Address" id="4"required></td>
			</tr>

			<tr>
				<td>Password<input type="password" name="password" id="5"required></td>
			</tr>
			<tr>
			<td><input type="submit" value="login"></td></tr>

		</table>
	</form>
</body>
</html>