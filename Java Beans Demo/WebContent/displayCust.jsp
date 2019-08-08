<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/WEB-INF/customTags.tld" prefix="address"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Customer Details</title>
	</head>
	<body>
<%-- 		<h3>Customer details</h3><br/> <%=session.getAttribute("cust") %> --%>
		
		<table>
			<tr>
				<td>Name: </td>
				<td>${cust.customerName}</td>
			</tr>
			<tr>
				<td>ID: </td>
				<td>${cust.customerId}</td>
			</tr>
			<tr>
				<td>Address: </td>
				<td>${cust.customerAddress}</td>
			</tr>
			<tr>
				<td>Bill Amount: </td>
				<td>${cust.billAmount}</td>
			</tr>
		</table>
		
		<form action="customerBilling.html">
			<input type="submit" value="Back to billing">
		</form>
		
		<address:deloitteAdd></address:deloitteAdd>
	</body>
</html>