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
        <style>
        body {
            font-family: Arial, sans-serif;
            background-color: rgba(21, 2, 12, 0.863);
            background-image: url("books.jpeg");
            background-size: cover;
        }

        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #9e2f3c;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-top: 50px;
            
        }

        h2 {
            text-align: center;
            color: #0d0a07;
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            box-sizing: border-box;
        }

        .button {
            background-color: #340202;
            color: #fff;
            padding: 10px 15px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }

        .button:hover {
            background-color: #c7c06e;
        }

        
    </style>
    </head>
    <body>
        
        <div class="container">
        <h2>User Login</h2>
            <s:form action="loginTest" method="post">  
                <s:textfield name="uname" label="Name"></s:textfield>  
                <s:password name="password" label="Password"></s:password>  
                <s:submit value="login"></s:submit>  
            </s:form> 
        </div>
    </body>
</html>
