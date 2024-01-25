<%-- 
    Document   : dashboard
    Created on : 1 Dec, 2023, 6:20:24 PM
    Author     : NITHU
--%>
<%@ taglib uri="/struts-tags" prefix="S" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                margin: 0;
                padding: 0;
                background-image: url("books.jpeg");
                background-size: cover;
                background-position: center;
                height: 100vh;
                display: flex;
                align-items: center;
                justify-content: center;
                color: #ffffff; /* Set the text color to white */
                font-family: 'Arial', sans-serif;
        }

        .library-container {
            text-align: center;
        }

        h1 {
            font-size: 3em;
            margin-bottom: 10px;
        }

        p {
            font-size: 1.2em;
            max-width: 600px;
            margin: 0 auto;
        }
        .buttons-container {
            margin-top: 20px;
        }

        .button {
            padding: 10px 20px;
            font-size: 1em;
            margin: 0 10px;
            cursor: pointer;
            background-color: black;
            color: white;
            border: none;
            border-radius: 5px;
             background-color:darkred ;
        }

        
    </style>
    </head>
    </head>
    <body>
        <div class="library-container">
        <h1>Welcome to Our Library</h1>
        <p>Explore our collection of books and enjoy reading!</p>
        <div class="buttons-container">
              
                <S:form method="post" action="Login.jsp">
                    <S:submit class="button"  style="padding: 10px 20px;
            font-size: 1em;
            margin: 0 10px;
            cursor: pointer;
            background-color: black;
            color: white;
            border: none;
            border-radius: 5px;
             background-color:darkred ;" onmouseover="this.style.backgroundColor='#c7c06e'" onmouseout="this.style.backgroundColor='#180303'" value="Login"> </S:submit> 
                </S:form>
          
          
                <S:form method="post" action="Register.jsp">
                    <S:submit class ="button" style="padding: 10px 20px;
            font-size: 1em;
            margin: 0 10px;
            cursor: pointer;
            background-color: black;
            color: white;
            border: none;
            border-radius: 5px;
             background-color:darkred ; " onmouseover="this.style.backgroundColor='#c7c06e'" onmouseout="this.style.backgroundColor='#180303'"  value="Register"> </S:submit> 
                </S:form>
                    
                
                    
          
        </div>
        
    </body>
</html>
