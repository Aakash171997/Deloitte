<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Sign up</title>
    <meta charset="UTF-8">
    <style><%@include file="resources/Login2.css"%></style> 
    <script><%@include file="resources/FormValidation.js"%></script>
    <script>
    locationvalidate()
    {
     var location = document.getElementById("location").value;
     var ErrorLocation = document.getElementById("ErrorLocation");
     if(location!=null)
    	 {
    	 
    	 ErrorLocation.innerHTML = "<p></p>"
    	 }
     else
    	 {
    	 ErrorLocation.innerHTML = "<p style ='color:red';> Enter a valid location</p>"
    	 
    	 }
    	    	
    }   
    </script>
    
</head>

<body>
    <div class="container-signup" id="container-replace">
        <div class="wrap-login">
        <c:url var="addAction" value="/api/addUser"></c:url>
            <f:form class="login-form validate-form" action="${addAction}" modelAttribute="user">
                <span class="form-title">
Sign up to get into our <br/> Good Books
</span>
                <div class="wrap-input">
                    <f:input path = "userName" class="input" type="text"  id="Username" name="Username" placeholder="UserName" onblur="usernamevalidate()"/>
                </div>
                <span id="ErrorUsername"> </span>
                <div class="wrap-input">
                    <f:input path = "eMail" class="input" type="text" id="eMail" name="Email" placeholder="Email" onblur="validateemail()"/><br>

                </div>
                <span id="ErrorEmail"> </span>
                 <span id = "ErrorUserExists">${ErrorUserExists}</span>

                <div class="wrap-input">
                    <f:input path = "password" class="input" type="password" id="password" name="password" placeholder="Password" onblur="passwordvalidate()"/>
                </div>
                <span id="ErrorPassword"> </span>
                <div class="wrap-input">
                    <input class="input" type="password" id="confirmpassword" name="confirm password" placeholder="Confirm Password" onblur="confimpasswordvalidate()"/>
                </div>
                <span id="MatchPassword"> </span>
                 <div class="wrap-input">
                    <f:input path = "location" class="input" type="text"  id="location" name="location" placeholder="Location" onblur = "locationvalidate()"/>
                </div>
                <span id="ErrorLocation"></span>

                <div class="container-login-form-btn ">
                    <input type="submit" class="login-form-btn" value="Sign up">
                </div>
               

                <span class="txt2">
Already a user? Awesome! <a href="/validate">Login</a> and resume!</span>
            </f:form>
            <div class="login-more">
            </div>
        </div>
    </div>
</body>
</html>