<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
		<meta charset="ISO-8859-1">
		<title>BookFlix</title>
		<style type="text/css"><%@include file="/WEB-INF/views/styles/homeStyles.css" %></style>
		<style type="text/css"><%@include file = "/WEB-INF/views/styles/statusForm.css" %></style>
	</head>
	
	<body>
		<div class="grid-container">
		  <div class="Header">
		  	<div class="heading">
		  		<center>BookFlix</center>
		  	</div>
		  </div>
		  <div class="Navigation">
			<div class="navbar">
				<a href="/home">Home</a>
				<a href="/addBook">Add to your Library</a>
				<a href="/borrow">Borrow Requests</a>
				<a href="/help">Help</a>
				<a href="/about">About</a>
				<a href="/validate">LogIn/SignUp</a>
				<c:if test="${!empty userName}">
					<div class="dropdown">
						<button class="dropbtn">${userName}
							<i class="fa fa-caret-down"></i>
						</button>
						<div class="dropdown-content">
							<a href="/myBooks">My Library</a>
							<a href="/logout">LogOut</a>
						</div>
					</div>
				</c:if>
			</div>
		  </div>
		  </div>
		  
		  <!-- List of books borrowed -->
		  <div class="StatusForm">
				<c:if test="${!empty map}">
				<center>					
					<f:form>
						<table width="40%">
						<c:forEach items="${map}" var="map">
							<tr>
								<td class = "td1">Book Name:</td>
								<td class = "td">${map.bookName}</td>
							</tr>
							
							<tr>
								<td class = "td1">Requester Name:</td>
								<td class = "td">${map.lessieName}</td>
							</tr>
							
							<tr >
								<td colspan="2" align="center"><button type ="submit" value = "Add Book" class="butn" formaction="/accept/${map.bookId}">Accept?</button></td>
							</tr>
							</c:forEach>
						</table>
					</f:form>
				</center>
				</c:if>
				<c:if test="${empty map}">
		  			<div class="b1">
		  				<h1>No Book Requested</h1>
		  			</div>
		  		</c:if>
			</div>
			
</body>
</html>