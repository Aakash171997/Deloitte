<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Add a New Movie</title>
	</head>
	<body bgcolor="#ffffff" text="#aaad78">
		<div id="header">
			<font face="Arial">
				<h1>Local Movie Database (LMDb)</h1>
			</font>
			<hr/>
		</div>
		<div id="form"><center>
			<f:form action="/api/saveMovie" method="post" modelAttribute="movie">
				<table border="5" width="50%">
					<tr>
						<td>Movie Index:</td>
						<td><f:input path="movieId" name="movieId"/></td>
					</tr>
					<tr>
						<td>Movie Name:</td>
						<td><f:input path="movieName" name="movieName"/></td>
					</tr>
					<tr>
						<td>Director:</td>
						<td><f:input path="directorName" name="directorName"/></td>
					</tr>
					<tr>
						<td>Budget:</td>
						<td><f:input path="budget" name="budget"/></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Submit" /> <input type="reset" value="clear"/></td>
					</tr>
				</table>
			</f:form>
		</center></div>
	</body>
</html>