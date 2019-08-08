<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Calculating...</title>
	</head>
	<body>
		<%!
			int num1, num2, result; 
			String op;
		%>
		<%
			num1 = Integer.parseInt(request.getParameter("num1"));
			num2 = Integer.parseInt(request.getParameter("num2"));
			op = request.getParameter("op");
			
			if(op != null){
				if(op.equals("add")){
					result = num1+num2;
				} else if(op.equals("sub")) {
					result = num1 - num2;
				} else if(op.equals("div")) {
					result = num1 / num2;
				} else {
					result = num1*num2;
				}
			} else {%>
				Please provide an operation!
				<form action="index.jsp"><input type="submit" value="Go back"></form>
		<%}
		%>
		
		<%
			request.setAttribute("result", result);
		%>
		<jsp:forward page="result.jsp"></jsp:forward>
	</body>
</html>