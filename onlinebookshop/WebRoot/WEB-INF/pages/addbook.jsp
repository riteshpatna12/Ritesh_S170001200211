
	
	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   			 pageEncoding="ISO-8859-1"%>
    
	<%@taglib prefix="jlc" uri="/WEB-INF/tlds/jlcindia.tld"%>
	 <%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>css/jlcindia.css">
<title>Adding Book Here</title>
</head>
 <body>
   <form action="addBook.jlc" method="post">
   <center>
      <table class="textStyle" height="95%">
   <tr bgcolor="orange">
     <td align="center" colspan="7">
       <font size="5"><b>Add Book Information</b></font>
     </td>
   </tr>
       <core:if test="${SHOW_ADD_BOOK ne 'OK' }">
   <tr><td align="center">
      <font size="5"><b> Book Name</b></font>
     </td>
      <td>
          <input type="text" size="35" style="color:black;background-color:#b4e0d2;font-size:20" name="bname">
     </td>
     <td>
        <font size="4" color="red"><b><jlc:error property="bname"/></b></font>
       </td>
     </tr>
     <tr>
       <td align="center" height="">
          <font size="5"><b>Author</b></font>
       </td>
       <td>
           <input type="text" size="35" style="color:black;background-color:#b4e0d2;font-size:20" name="author">
       </td>
        <td> 
         <font size="4" color="red"><b><jlc:error property="author"/></b></font>
     </td></tr>
     <tr>
       <td align="center" height="">
          <font size="5"><b>Cost</b></font>
     </td>
        <td>
           <input type="text" size="35" style="color:black;background-color:#b4e0d2;font-size:20" name="cost">
       </td>
       <td>
           <font size="4" color="red"><b><jlc:error property="cost"/></b></font>
        </td></tr> 
        
         <td align="center" height="">
          <font size="5"><b>Publication</b></font>
     </td>
        <td>
           <input type="text" size="35" style="color:black;background-color:#b4e0d2;font-size:20" name="publication">
       </td>
       <td>
           <font size="4" color="red"><b><jlc:error property="pulication"/></b></font>
        </td></tr> 
        
           <td align="center" height="">
          <font size="5"><b>Edition</b></font>
     </td>
        <td>
           <input type="text" size="35" style="color:black;background-color:#b4e0d2;font-size:20" name="edition">
       </td>
       <td>
          <select style="color: black;background-color:#b4e0d2;font-size:20" name="edition">
             <option value="1st Edition">1st Edition</option>
             <option value="2nd Edition">2nd Edition</option>
             <option value="3rd Edition">3rd Edition</option>
             <option value="4th Edition">4th Edition</option>
           </select>
        </td>
        <td></td>
        </tr>
        <tr>
        <td colspan="3" align="center">
        <input type="submit" value="Add Book" style="color:white;background-color:maroon;font-size:17">
       </td>
       </tr>
       </core:if>
       </table>
       </center>
       </form>  
    
     </body>
   </html>