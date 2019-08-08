<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Search Customer</title>
	</head>
	<body bgcolor="#31e886" text="#39875d">
		<font face="Arial" size="20">
		<center>Customer Search</center>
		</font>
		<hr color="#39875d"/>
		<center>
		
		<f:form action="find.do">
			<table cellspacing="10" cellpadding="10" align="center">
			<tr>
				<td>Customer ID:</td>
				<td><f:input path="customerId" type="text" id="customerId" name="customerId"></f:input></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
				<td><input type="reset" value="Clear"></td>
			</tr>
			<tr>
				<td>Customer Name:</td>
				<td><f:input path="customerName" id="customerName" name="customerName"></f:input></td>
			</tr>
			<tr>
				<td>Customer Address:</td>
				<td><f:input path="customerAddress" type="text" id="customerAddress" name="customerAddress"></f:input></td>
			</tr>
			<tr>
				<td>Bill Amount:</td>
				<td><f:input path="billAmount" tpe="text" id="billAmount" name="billAmount"></f:input></td>
			</tr>
			<tr>
<!-- 				<td align="center"><input type="submit" value="Submit"></td> -->
<!-- 				<td align="center"><input type="reset" value="Clear"></td> -->
			</tr>
			</table>
		</f:form>
		</center>
	</body>
</html>