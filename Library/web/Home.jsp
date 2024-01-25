<%-- 
    Document   : Home
    Created on : 9 Dec, 2023, 8:45:57 PM
    Author     : NITHU
--%>
<%@taglib uri="/struts-tags" prefix="S" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 20px;
            background-image: url("library_bg.jpg");
            background-size: cover;
        }

        h1 {
            color: #dfcbcb;
            font-size: 50px;
        }

        .button {
            display: inline-block;
            padding: 20px 30px;
            font-size: 25px;
            text-align: center;
            text-decoration: none;
            background-color: #13aab5;
            color: rgb(6, 0, 0);
            border: 1px solid #13aab5;
            border-radius: 5px;
            cursor: pointer;
            margin: 10px;
        }

        .button:hover {
            background-color: #ac485e;
        }
        
        footer {
            
            color: #fff;
            text-align: center;
            padding: 5px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>
    <h1>Welcome to the Library</h1>
    
    <a href="Add.jsp" class="button">Add</a>
    <a href="Display.jsp" class="button">List</a>
    
    
     <footer>
        <p>&copy; 2023 Your Library Store. All rights reserved.</p>
    </footer>
</body>
    
</html>
