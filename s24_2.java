login.html
<html>
<head>
<title>Login Page</title>
</head>
<body>
<form action="check.jsp">
<legend>Enter User Id and Password...!!!</legend>
UserId: <input type="text" name="id" /> <br><br>
Password: <input type="text" name="pass" /> <br><br>
<input type="submit" value="Sign In!!"/>
</div>
</form>
</body>
</html>


check.jsp
<html>
<head>
<title>Check Credentials</title>
</head>
<body>
<%
    	String uid=request.getParameter("id");
    	String password=request.getParameter("pass");
    	session.setAttribute("session-uid", uid);
    	if(uid.equals("mmcc") && password.equals("bsc"))
    	{
   		 response.sendRedirect("success.html");
    	}
    	else
   	 {
        	response.sendRedirect("failed.html");
    	}
    	%>
</body>
</html>
success.html
<html>
<head><title>Success Page</title></head>
<body>
<h1>
 Login Successfully...!!!
 </h1>

</body>
</html>

        
failed.html
<html>
<head><title>Success Page</title></head>
<body>
<h1>
 User Id and Password are wrong. Please try Again...!!!
 </h1>

</body>
</html>

