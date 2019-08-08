<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>First JSP demo</title>
	</head>
	<body>
		<form action="index.jsp">
			Enter your Marks: <input type="text" id="marks" name="marks"><br/>
			<input type="submit">
		</form>
		
		<br/><br/>
		
		<%
			if(request.getParameter("marks")==null || request.getParameter("marks").equals("")){
				out.print("<br/>Please enter your marks");
			} else {
				int marks = Integer.parseInt(request.getParameter("marks")); 
				if(marks<50){
				%>
				<font color="red">REGRET</font>
				<%} else { %>
				<font color="green">PASS</font>
				<%}
			}%>
		
	</body>
</html>