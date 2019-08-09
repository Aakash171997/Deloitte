<!-- 
author: anweshpatel
created: 9/8/2019
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
		<title>BookFlix - All Books</title>
		<style type="text/css"><%@include file="/WEB-INF/views/styles/addFormStyles.css" %></style>
		<style type="text/css"><%@include file="/WEB-INF/views/styles/tableStyle.css" %></style>
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
		  	
		  	<c:if test="${!empty allBooks}">
		  		<div class="b1">
		  			Your Library
		  		</div>
		  		<br/>
		  		<br/>
		  		
		  		<table border=1px width="80%" class="content-table">
		  			<tr>
		  				<th>Book Name</th>
		  				<th>Authors</th>
		  				<th colspan="2">Edit/Remove</th>
		  			</tr>
			  		<c:forEach items="${allBooks}" var="book">
			  			<tr>
			  				<td>${book.bookName}</td>
			  				<td>${book.authors}</td>
			  				<td><a href="/modify/${book.bookRef}">Edit</a></td>
			  				<td><a href="/delete/${book.bookRef}">Remove</a></td>
			  			</tr>
			  		</c:forEach>	
		  		</table>
		  		<div class="sucMessage">
		  			${message}
		  		</div>
		  	</c:if>
		  	<c:if test="${empty allBooks}">
		  		<div class="b1">
		  			You don't seem to have any books in your library!
		  		</div>
		  		<br/>
		  		<br/>
		  		Add your books <a href="/addBook">here</a>
		  	</c:if>
		  </div>
	</body>
</html>