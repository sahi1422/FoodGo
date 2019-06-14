<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <title>FORGOT_PASSWORD | FOODGO</title>
  <link rel="stylesheet" href="css/proj1.css">

  <style>
  	.logbox{
  		height : 420px;
  	}
  </style>
</head>
<body class="bod">
  <div class="logbox">
    <img src="images/l1.png" class="user">
      <br><br>
    <h2 class="h22">Reset Password</h2>
    <center><span style="color:#8eb640; size:30px ">${param.wrong}</span></center>
    <form name="myform" method="post" action="Reset_pass" onsubmit="return validate123()">
      <pre style="color: white; font-size: 17px;margin-left: 40px;">Please Enter your new password below &
we will reset your password.</pre>
      <p>New Password : </p><input type="password" name="password" placeholder="Enter your new password here" size="50">      
      <input type="submit"  value="Submit">
      <pre  style="margin-left: 40px;">Already have account?  <a href="signin.jsp" class="su">Sign In</a>  here</pre>
    </form>
  </div>
  <br>
    <script type="text/javascript" src="js/projFP.js"></script>
    <script type="text/javascript">
    function validate123(){
    	var password=document.myform.password.value;

    	if(password.length<8) {
    		alert("Password must be at least 8 character long!");
    		return false;
    	}
    	//else return true;
    }
    </script>
  </body>
</html>
