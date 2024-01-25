<%-- 
    Document   : Login
    Created on : 1 Dec, 2023, 5:19:08 PM
    Author     : NITHU
--%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="loginTest" method="post">  
        <s:textfield name="uname" label="Name"></s:textfield>  
        <s:password name="password" label="Password"></s:password>  
        <s:submit value="login"></s:submit>  
        </s:form>  
    </body>
</html>
