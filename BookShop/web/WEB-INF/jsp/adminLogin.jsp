<%-- 
    Document   : adminLogin
    Created on : Sep 3, 2016, Sep 3, 2016 10:07:41 AM
    Author     : ritesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
        <link rel="stylesheet" href="/BookShop/css/admin.css" type="text/css">
    </head>
    <body onload='document.f.j_username.focus();'>
        <div id="headerDiv">
            <table class="headerTable" border="0" width="100%">
                <tr><td><h1>Login</h1></td></tr>
            </table>
        </div>
        <form name='adminLoginForm' action="<c:url value='j_spring_security_check'/>" method='POST'>  
            <table width="30%" align="center" border="0" cellpadding="0" cellspacing="0">
                <tr><td width="100%" colspan="2">&nbsp;</td></tr>
                <tr><td class="hrLine" width="100%" colspan="2">&nbsp;</td></tr>
                <tr>
                    <td colspan="2">
                        <c:if test="${not empty error}">
                            <div class="error">
                                Your Login attempt was not successful,try again.<br/>
                                Invalid username or password.
                            </div>
                        </c:if>
                    </td> 
                </tr>
                <tr>
                    <td width="30%">UserName</td>
                    <td>
                        <input type='text' name='j_username' value="">
                    </td>     
                </tr>
                <tr><td width="100%" colspan="2">&nbsp;</td></tr>
                <tr>
                    <td width="30%">Password</td>
                    <td>
                        <input type='password' name='j_password'>
                    </td>     
                </tr>
                <tr><td width="100%" colspan="2">&nbsp;</td></tr>
                <tr>
                    <td width="100%" colspan="2" class="loginButtonAlign">
                        <input type="submit" name="submit" title="Login" class="loginButton" value=""/>
                    </td>    
                </tr
                <tr><td class="hrLine" width="100%" colspan="2">&nbsp;</td></tr>
            </table>
        </form>
        <%@include file="/WEB-INF/jsp/adminFooter.jsp"%>
    </body>
</html>
