<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>BookFlix - About</title>
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
					<img alt="Loading..." src="/Images/About.jpg" align="center" width="40%">
				</center>
				
				<font style="font-weight: bold;">Developed by</font><br/><br/>
				Anwesh, Rama, Dan and Aakash<br/>
				
				<br/>
				<font style="font-weight: bold;">Find us at</font><br/><br/>
				
				Bengaluru, Karnataka<br/>
				India <br/>
			</div>
	</body>
</html>