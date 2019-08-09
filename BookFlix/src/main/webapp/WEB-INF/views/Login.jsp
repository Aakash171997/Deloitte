<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Login</title>
    <meta charset="UTF-8">
     <style><%@include file="resources/Login2.css"%></style>
          <style>
     
     a.takehome
     {
     float : right;
     padding : 10px,10px;
     
     }
     
     </style> 

</head>

<body style="background-color: #666666;" background-image="Book1.jpg">
    <div class=" container-login">
        <div class="wrap-login">
         <c:url var="addAction" value="/validate/check"></c:url>
            <f:form class="login-form validate-form" action="${addAction}" modelAttribute="login">
           
                <span class="form-title ">
Login to continue
</span>
                <div class="wrap-input">
                    <input path = "eMail" class="input" type="text" name="eMail" placeholder="Email">
                </div>

                    <div class="wrap-input">
                        <input path = "password" class="input" type="password" name="password" placeholder="Password">
                    </div>
                    <span id = "Errorlogin">${ErrorLogin}</span>
                    <div class = "forgot-pass">
                       
                            <a href="#">
                                Forgot Password?
</a>
                       
                    </div>

                        <div class="container-login-form-btn ">
                            <button class="login-form-btn ">
Login
</button>
                        </div>

                        <span class="txt2">
Not a user? <a href = "/addUser">Sign up here</a> and read with us!</span>
<a class = "takehome" href = "/home">Take me home instead</a>
                        </span>

                
            </f:form>
            <div class="login-more">
            </div>
        </div>
    </div>
</body>