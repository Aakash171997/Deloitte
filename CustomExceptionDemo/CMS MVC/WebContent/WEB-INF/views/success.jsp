<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body bgcolor="#0061e8">
		<center>
		<font color="#ffffff" face="Arial">
		<h1>Thank you!</h1>
		<hr/>
		<table border="5">
			<tr>
				<td><b>Customer ID</b></td>
				<td><b>Name</b></td>
				<td><b>Address</b></td>
				<td><b>Bill Amount</b></td>
			</tr>
			<tr>
				<td>${cid}</td>
				<td>${name}</td>
				<td>${address}</td>
				<td>${bill}</td>
			</tr>
		</table>
		</font>
		</center>
	</body>
</html>