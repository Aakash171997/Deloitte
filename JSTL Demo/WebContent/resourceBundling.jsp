<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<fmt:bundle basename="com.ResourceBundlingEx" prefix="count.">
		<fmt:message key="one" />
		<br />
		<fmt:message key="two" />
		<br />
		<fmt:message key="three" />
		<br />
	</fmt:bundle>
</body>
</html>