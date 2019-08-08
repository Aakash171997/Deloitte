<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Validating...</title>
	</head>
	<body>
		<%
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			if(username.equals("anwesh") && password.equals("root")){
				%>
				<jsp:forward page="success.jsp"></jsp:forward>
				<%
			} else {
				session.setAttribute("errMesg", "Invalid username or password");
				response.sendRedirect("login.jsp");
			}
		%>
	</body>
</html>