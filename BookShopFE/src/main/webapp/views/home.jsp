<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>bookshop</title>
</head>
<body>
<h2> Welcome to BookShop</h2>

        ${message}
<br/>
<a href="login" >Login Here</a>  &nbsp;&nbsp;&nbsp;

<a href="register"> New User</a>


<hr color="blue"/>
<c:if test="${cSize>0}">
<table border="1">
<tr>
<th> Id </th>
<th> Name </th>
<th> Description </th> </tr>
<c:forEach var="catg" items="${categoryList}">

<tr>
  <td>${catg.id}</td>
  <td>${catg.name}</td>
  <td>${catg.description}</td>
</tr>  

</c:forEach>
</table>
</c:if>

<c:if test="${Login==true}">
	<%@ include file="/views/login.jsp" %>
</c:if>

<c:if test="${Register==true}">
	<%@ include file="/views/register.jsp" %>
</c:if>

</body>
</html>