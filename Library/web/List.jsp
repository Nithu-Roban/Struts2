<%-- 
    Document   : List
    Created on : 9 Dec, 2023, 8:12:26 PM
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
            background-color: rgba(186, 16, 107, 0.863);
            background-image: url("library_bg.jpg");
            background-size: cover;
        }

        .container {
            max-width: 600px;
           
            margin: 0 auto;
            padding: 30px;
            background-color: #556980;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-top: 50px;
            margin-left: 50px;
            
        }

        h2 {
            text-align: center;
            color: #0d0a07;
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: black;
            
        }

        input {
            width: 150%;
            padding: 20px;
            margin-bottom: 15px;
            box-sizing: border-box;
        }

        .button {
            background-color: #180303;
            color: #fff;
            padding: 10px 15px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }

        .button:hover {
            background-color: #c7c06e;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            background-color: #f2f2f2;
        }

        table, th, td {
            border: 1px solid #ddd;
        }

        th, td {
            padding: 12px;
            text-align: left;
        }

        th {
            background-color: #180303;
            color: #fff;
            font-weight: bold;
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
   
    
    <div class="container">
            <h2> Add Books </h2>
            <S:form action="display" method="get">
                <table border="1">
            <tr>
                <th>Book Name</th>
                <th>Author Name</th>
                <th>Count</th>
           
            </tr>
            
            <S:iterator value = "bookList">	
               <tr>
                  <td><S:property value = "bname"/></td>
                  <td><S:property value = "aname"/></td>
                  <td><S:property value = "count"/></td>
                 </tr>
            </S:iterator>	
         </table>
    
                
                <br><br><br> <a href="Home.jsp" class="button">Back</a>
            </S:form>
            
            
            
            
    <footer>
        <p>&copy; 2023 Your Library Store. All rights reserved.</p>
    </footer>
    </body>
</html>
