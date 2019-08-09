function usernamevalidate()
{
var usernameInput = document.getElementById("Username").value;
var ErrorUsername = document.getElementById("ErrorUsername");

usernameInput = usernameInput.split(' '); //we split the string in an array of strings using     whitespace as separator
        if(usernameInput.length == 1)
        {

            ErrorUsername.innerHTML="<p> </p>"
        }
        else
        {
ErrorUsername.innerHTML="<p style='color:red'>Username shouldn't contain spaces></p>"


        }
} 

function validateemail()  
        {  
            var emailInput = document.getElementById("Email").value;
            var ErrorEmail = document.getElementById("ErrorEmail");
                var atposition=emailInput.indexOf("@");  
                var dotposition=emailInput.lastIndexOf(".");  
                if (atposition<1 || 
                        dotposition<atposition+2 || 
                            dotposition+3
                            >=emailInput.length)
                        {  
                          ErrorEmail.innerHTML="<p style='color:red;'>Invalid Email Id</p>"
                          return false;
                        } 

                else{
                    ErrorEmail.innerHTML="<p></p>"
                    
                 

                }
        }  

function passwordvalidate()
{

    var passwordInput = document.getElementById("password").value;
    var Errorpassword = document.getElementById("ErrorPassword");
     
    var letters = /^[0-9a-zA-Z]+$/; 
    if(passwordInput.match(letters) && passwordInput.length>8) 
    { 
     Errorpassword.innerHTML="<p></p>"
    } 
    else 
    { 
    Errorpassword.innerHTML="<p style = 'color:red'>Please enter alphanumeric characters more than 8 characters</p>"
    return false; 
    } 



}
function confimpasswordvalidate()
{
  var matchpassword = document.getElementById("confirmpassword").value;
  var passwordInput = document.getElementById("password").value;
  var ErrorMatchPassword = document.getElementById("MatchPassword");
  if(matchpassword!=passwordInput)
  {
    ErrorMatchPassword.innerHTML="<p style = 'color:red'> Passswords don't match</p>" 
    return false;
  }
  else
  {

     ErrorMatchPassword.innerHTML="<p></p>"
     return true;

  }
  
}
       





