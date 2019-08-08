<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login Page</title>
	</head>
	<body>
		<h2>Login App</h2>
		<form action="validate.jsp" method="post">
			<table width=40%>
				<tr>
					<td>Username : </td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password : </td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Clear Feilds"></td>
					<td><input type="submit" value="Login"></td>
				</tr>
				<tr>
					<td colspan="2">
						<%if(session.getAttribute("errMesg") != null){ %>
							<font color="#b82828"><%=session.getAttribute("errMesg") %></font>
						<%
							session.invalidate();
						}%>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>