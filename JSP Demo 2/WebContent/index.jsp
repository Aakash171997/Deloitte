<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="operation.jsp">
			<table>
				<tr>
					<td colspan="4">Number 1:</td>
					<td colspan="4"><input type="text" name="num1"></td>
				</tr>
				<tr>
					<td colspan="4">Number 2:</td>
					<td colspan="4"><input type="text" name="num2"></td>
				</tr>				
				<tr>
					<td>+</td>
					<td><input type="radio" name="op" value="add"></td>
					<td>-</td>
					<td><input type="radio" name="op" value="sub"></td>
					<td>/</td>
					<td><input type="radio" name="op" value="div"></td>
					<td>*</td>
					<td><input type="radio" name="op" value="mul"></td>
				</tr>
				<tr>
					<td colspan="2"></td>
					<td colspan="2"><input type="submit" value="Compute"></td>
					<td colspan="2"><input type="reset" value="Clear"></td>
					<td colspan="2"></td>
				</tr>
			</table>
		</form>
	</body>
</html>