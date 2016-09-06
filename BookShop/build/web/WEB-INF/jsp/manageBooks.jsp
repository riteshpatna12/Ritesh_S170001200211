
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Books</title>
        <link rel="stylesheet" href="/BookShop/css/admin.css" type="text/css">
    </head>
    <body>
        <%@include file="/WEB-INF/jsp/adminHeader.jsp" %>
        <br/>
        <form:form method="post" action="${pageContext.request.contextPath}/admin/saveBook" commandName="book" enctype="multipart/form-data">
            <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td>
                        <table border="0" cellpadding="0" cellspacing="0" width="100%">
                            <tr>
                                <td class="manageForms">Manage Books</td>
                                <td align="center" class="error">${dbError}</td>
                                <td class="information">It is Mandatory to enter information in all information<br>capture boxes which have a<span class="mandatory">*</span>adjacent
                                </td>
                            </tr>
                        </table>   
                    </td>
                </tr>
                
                <tr><td class="hrLine">&nbsp;</td></tr>
                <tr>
                    <td>
                        <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
                            <tr>
                                <td>
                                    <table width="100%" border="0" cellpadding="4" cellspacing="4">
                                        <tr>
                                            <td class="sectionName" colspan="4">
                                                <br/>Book Details<br/></br>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="10%">Book Name<span class="mandatory">*</span>:</td>
                                            <td width="45">
                                                <form:input path="bookName" title="Enter the book name" maxlength="25" size="55"/></br>
                                                <form:errors path="bookName" cssClass="error"/>
                                            </td>
                                            <td width="10%">Publisher<span class="mandatory">*</span>:</td>
                                            <td width="45%">
                                                <form:select path="publisherNo">
                                                    <form:option value=""label="---Select---"/>
                                                    <form:options title="Select the publisher" items="${publisherList}" itemValue="publisherNo" itemLabel="publisherName"/>
                                                </form:select><br>
                                                <form:errors path="publisherNo" cssClass="error"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="10%">Category<span class="mandatory">*</span>:</td>
                                            <td width="45%">
                                                <form:select path="categoryNo">
                                                    <form:option value=""label="---Select---"/>
                                                    <form:options title="Select the category" items="${categoryList}" itemValue="categoryNo" itemLabel="category"/>
                                                </form:select><br>
                                                <form:errors path="categoryNo" cssClass="error"/>
                                            </td>
                                            <td width="10%">Cover Page:</td>
                                            <td width="45%"><input type="file" id="coverPageFile" name="coverPageFile" title="Select a cover Page for this book"/>
                                            </td>
                                        </tr>
                                        <tr>
                                             <td width="10%">ISBN<span class="mandatory">*</span>:</td>
                                            <td width="45%">
                                                <form:input path="isbn" title="Enter the isbn" maxlength="15" size="30"/><br>
                                                <form:errors path="isbn" cssClass="error"/>
                                            </td>
                                            <td width="10%">Edition<span class="mandatory">*</span></td>
                                            <td width="45%">
                                                <form:input path="edition" title="Enter the Edition" maxlength="25" size="55"/><br>
                                                <form:errors path="edition" cssClass="error"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="10%">Year<span class="mandatory">*</span>:</td>
                                            <td width="45%">
                                                <form:input path="year" title="Enter the year" maxlength="4" size="4"/><br>
                                                <form:errors path="year" cssClass="error"/>
                                            </td>
                                            <td width="10%">Cost<span class="mandatory">*</span>:</td>
                                            <td width="45%">
                                                <form:input path="cost" title="Enter the cost of the Boo" maxlength="8" size="8"/><br>
                                                <form:errors path="cost" cssClass="error"/>
                                            </td>
                                        </tr>    
                    
                
                
        </body>                        
</html>
