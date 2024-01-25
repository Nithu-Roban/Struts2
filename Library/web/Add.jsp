<%-- 
    Document   : home
    Created on : 9 Dec, 2023, 1:48:00 PM
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
            padding: 10px 210px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }

        .button:hover {
            background-color: #c7c06e;
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
            <S:form action="add" method="get">
                <S:textfield name="bname" label="Book Name"></S:textfield>
                <S:textfield name="aname" label="Author"> </S:textfield>
                <S:textfield name="count" label="Book Count"> </S:textfield>

                
                <S:submit class ="button" style="background-color: #180303; color:white; " onmouseover="this.style.backgroundColor='#c7c06e'" onmouseout="this.style.backgroundColor='#180303'" value="Add"> </S:submit>
                
            </S:form>

            <a href="Home.jsp" class="button">Back</a>
        </div>
        
        
        <footer>
        <p>&copy; 2023 Your Library Store. All rights reserved.</p>
    </footer>
    </body>
</html>
