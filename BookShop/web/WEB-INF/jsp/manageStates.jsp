

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bookshop-->Managestates</title>
        <link rel="stylesheet" href="/BookShop/css/admin.css" type="text/css">
    </head>
    <body>
        
        
        </br>
        <form:form method="post" action="${pageContext.request.contextPath}/admin/saveState" commandName="state">
        <form:hidden path="stateNo"/>    
        <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
            <tr>
                <td>
                    <table border="0" cellpadding="0" cellspacing="0" width="100%">
                        <tr>
                            <td class="manageForms">Manage States</td>
                            <td align="center" class="error">${dbError}</td>
                            <td class="Information">
                                It is Mandatory to enter information in all Information<br>capture
                                boxes which have a<span class="mandatory">*</span>adjacent
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            
            <tr><td class="hrLine">&nbsp;</td></tr>
            <tr>
                <td>
                    <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" >
                        <tr>
                            <td>
                                <table border="0" cellpadding="4" cellspacing="4" width="100%">
                                    <tr>
                                        <td class="sectionName" colspan="2">
                                            <br/>State Details<br/><br/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="10%">State Name<span class="mandatory">*</span>:</td>
                                        <td>
                                            <form:input path="state" title="Enter the State name" maxlength="25" size="55"/> <br/>
                                            <form:errors path="state" cssClass="error"/>
                                        </td>
                                    </tr>    
                                </table>
                            </td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                        
                        <tr>
                            <td colspan="2" class="centerAlign">
                                <input type="submit" class="groovybutton" value="Save"/>
                                <input type="reset" value="clear" class="groovybutton" onclick="javascript:document.location.href='/BookShop/admin/manageStates'"/>  
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr><td>&nbsp;</td></tr>
            <tr><td class="hrLine">&nbsp;</td></tr>
            <tr><td><br></td></tr>
        </table>
    </form:form>
    
    <c:if test="${!empty stateList}">
        <table class="data" width="100%">
            <tr>
                <th width="94%">State</th>
                <th width="3">&nbsp;</th>
                <th width="3">&nbsp;</th>
            </tr>
            <c:forEach items="${stateList}" var="state">
                <tr>
                    <td>${state.state}</td>
                    <td><a href="/BookShop/admin/deletestate/${state.stateNo}">
                            <img title="Click to Delete" src="/BookShop/images/delete.jpg"/></a></td>
                    <td><a href="/BookShop/admin/editCountry/${state.stateNo}">
                            <img title="Click to edit" src="/BookShop/images/edit.jpg"/></a></td>    
                </tr>
            </c:forEach>    
        </table> 
       </c:if> 
                                        
    
    </body>
</html>
