<!-- 
author: Aakash171997
created: 7/8/2019
project: BookFlix
 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>BookFlix - Add Book</title>
		<style type="text/css"><%@include file="/WEB-INF/views/styles/addFormStyles.css" %></style>
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
			
			<div class="AddBookForm">
				<center>
					<c:url var="addAction" value="/api/addBook"></c:url>
					<f:form action = "${addAction}" modelAttribute="book">
						<table width="80%">
							<tr>
								<td width="180">Book Name:</td>
								<td width="500"><f:input path="bookName" name="bookName" placeholder="Title of the book"/></td>
							</tr>
							
							<tr>
								<td>Author:</td>
								<td><f:input path="authors" name="authors" placeholder="List of authors"/></td>
							</tr>
							<tr>
								<td>ISBN:</td>
								<td><f:input path="isbn" name="isbn" placeholder="ISBN Number"/></td>
							</tr>
							<tr>
								<td>Description:</td>
								<td><f:input path="description" name="description" placeholder="A short description..."/></td>
							</tr>
							<tr>
								<td colspan="2" align="center"><button type ="submit" value = "Add Book" class="butn">Add Book</button></td>
							</tr>
							<tr>
								<td colspan="2" align="center">
									<div class="sucMessage">${message}</div>
								</td>
							</tr>
						</table>
					</f:form>
				</center>
			</div>
		</div>
	</body>
</html>