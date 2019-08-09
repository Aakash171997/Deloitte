<!-- 
author: anweshpatel
created: 07/08/2019
project: BookFlix
 -->

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
		  
		  <!-- Search Panel operation -->
		  
		  <div class="SearchPanel">
		  	<f:form modelAttribute="searchQuery">
		  		<table>
		  			<tr>
		  				<td width="900">
		  					<f:input path="query" name="query" size="80" placeholder="Search by book or author name..."/>
		  				</td>
		  				<td width="100">
		  					<button type="submit" value="Search" formaction="/searchResults" class="butn">Search</button>
		  				</td>
		  			</tr>
		  		</table>
		  	</f:form>
		  </div>
		  
		  <!-- Results -->
		  
		  <div class="SearchResults">
		  		<c:if test="${!empty searchResult}">
		  			<h3>Search result</h3>
		  			<table width="100%">
		  				<c:forEach items="${searchResult}" var="book">
		  					<tr>
		  						<td colspan="2"><a href="<c:url value='/show/${book.bookRef}'/>">${book.bookName}</a></td>
		  					</tr>
		  					<tr>
		  						<td width="10" style="width: 48px; ">By : </td>
		  						<td>${book.authors}</td>
		  					</tr>
		  					<tr>
		  						<td colspan="2">
			  						<font color=#757575>
			  							${book.description}
			  						</font>
		  						</td>
		  					</tr>
		  					<tr>
		  						<td><br/></td>
		  					</tr>
		  				</c:forEach>
		  			</table>
		  			<div class="b2">
		  				That'll be all...
		  			</div>
		  		</c:if>
		  		<c:if test="${empty searchResult}">
		  			<div class="b1">
		  				${searchAreaMessage}
		  			</div>
		  		</c:if>
		  </div>
		</div>
	</body>
</html>