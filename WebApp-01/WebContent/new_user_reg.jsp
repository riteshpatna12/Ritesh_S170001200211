<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<body style="background-color:powderblue;">
		<center>
	  	
		<form name="newuserreg">
			<table>
				<tr>
					<th colspan="5" bgcolor="orange">NEW USER REGISTRATION FORM:</font></th>
				</tr>
					<tr><td align="center" colspan="3"><font size="3"><b>First Name*</b></font></td>
					
			        <td><input type="text" name="nuserfirstname" placeholder="Enter your first name" requried></td>
			    </tr>
				<tr>
				    <td align="center" colspan="3"><font size="3"><b>Last Name*</b></font></td>
			        <td><input type="text" name="nuserlasttname" placeholder="Enter your last name" requried></td>
			    </tr>
				
				<tr>
				    <td align="center" colspan="3"><font size="3"><b>Password*</b></font></td>
			        <td><input type="password" name="nuserpwd" placeholder="Enter your Password" requried></td>
			    </tr>
				<tr>
				    <td align="center" colspan="3"><font size="3"><b>RE-Enter Password*</b></font></td>
			        <td><input type="password" name="nuserrepwd" placeholder="RE-Enter your Password" requried></td>
			    </tr>

				<tr>
				    <td align="center" colspan="3"><font size="3"><b>Date Of Birth*</b></font></td>
			        <td><input type="date" name="dob" placeholder="Enter your Date of Birth" requried></td>
			    </tr>
				
				<tr>
				    <td align="center" colspan="3"><font size="3"><b>Email ID*</b></font></td>
			        <td><input type="text" name="nuseremail" placeholder="Enter your email ID" requried></td>
			    </tr>
				<tr>
				    <td align="center" colspan="3"><font size="3"><b>Phone Number*</b></font></td>
			        <td><input type="text" name="nuserphone" placeholder="Enter your Phone Number" requried></td>
			    </tr>
				<tr>
				  <td align="center" colspan="3"><font size="3"><b>Gender</b></font></td>
				  <td><input type="radio" name="gender" value="Male"><font size="3"><b>Male</b></font>
				      <input type="radio" name="gender" value="Female"><font size="3"><b>Female</b></font>				  
				  </td>
				</tr> 
 
				<tr>
				    <td align="center" colspan="3"><font size="3"><b>PAN Card Number*</b></font></td>
			        <td><input type="text" name="nuserpan" placeholder="Enter your Pancard number" requried></td>
			    </tr>
				<tr>
				   <td align="center" colspan="3"><font size="3"><b>Address</b></font></td>
			        <td><input type="text" name="nuseradd" placeholder="Enter your complete Address" requried></td>
			    </tr>
				<tr>
				    <td align="center" colspan="3"><font size="3"><b>Area Pincode</b></font></td>
			        <td><input type="text" name="nuserpincode" placeholder="Enter Pincode" requried>
					</td>
			    </tr>
				<tr>
			        <td colspan="3" align="center"><br>
					<input type="submit" name="regsubmit" value="Register Me" style="color:white;background-color:maroon;font-size:17"></td>
				</tr>	
			</table>	
				<p>Note: Please make sure your details are correct before submitting form and that all fields marked with * are completed!.</p>
		</form>
	  </center>
</body>
</html>