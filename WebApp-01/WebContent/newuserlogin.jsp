<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

   <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/vizron.css"> 
   <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/main.css">
 </head>
<body>
<form action="newuserlogin.vizron" method="post">
   <center>
   <table class="textstyle">
					<tr>
						<td align="center" colspan="3"><font size="7"><b>Account LOGIN:</b></font></td>
					</tr>	
					
					<tr>
						<td align="center" colspan="3">
						<font size="4" color="red">
						<br><vizron:error property="loginError"/></b></font>
						</td>
					</tr>
					<tr><td><br/></td></tr>
					
					<tr>
						<td align="center" colspan="3">
						<b><font size="5">Name Or Email Id:</font>
						<td><input type="text" name="regId" placeholder="Enter your Name or Email_ID" requried></td>
					</tr>
					<tr>
						<td align="center" colspan="3">
						<b><font size="5"><b>Password:</b></font></td>
						<td><input type="password" name="pwd" id="pwd" placeholder="Enter Password" requried></td>
					</tr>
					<tr>
						
						<td><input type="submit" id="userloginsubmit" value="Login Me" style="color:white;background-color:maroon;font-size:17"></td>
						<td><input type="reset" value="Reset Me" style="color:white;background-color:maroon;font-size:17"></td>
					</tr>
					
					<tr>
						
						<td><a href="index.jsp">HOME</a>
						</td>
						</tr>
						
					
					<tr>
						<td align="center" colspan="3">
						<b><font size="3" color="green" >New User:</font>
						<a href="registerDef.html"><font size="3">SignUp Here</font></a></b></td>
					</tr>
					<tr>
						<td align="center" colspan="3">
						<b><font size="3" color="green" >Forget Password:</font>
						<a href="forgetPasswordDef.html"><font size="3">Click Here</font></a></b></td>
					</tr>
				</table>	
		</center>		
</form>
</body>
 </html>