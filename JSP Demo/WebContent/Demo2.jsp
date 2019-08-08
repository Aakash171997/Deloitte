<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Demo2</title>
	</head>
	<body>
		<%
			String username;
			Date d = new Date();
		%>
		
		<%
			username = request.getParameter("username");
		%>
		Welcome,
		<%=username %>
		
		<%
			if(username.equals("anwesh")){
				d=new Date();
				RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
				dispatcher.include(request, response);
			} else {
				out.print("Invalid username");
			}
		%>
		
		Today's date is <%=d %>
	</body>
</html>