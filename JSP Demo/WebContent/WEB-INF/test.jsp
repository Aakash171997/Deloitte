<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html><body>
<% x=3; %>
<% int x=5; %>
<%! int x=7; %>
x = <%=x%>, <%=this.x%>
</body></html>
