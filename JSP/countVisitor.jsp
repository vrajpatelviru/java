<%-- 
    Document   : countVisitor
    Created on : Mar 30, 2025, 9:10:04 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Integer hitsCount=(Integer)application.getAttribute("hitscounter");
            
            if(hitsCount==null || hitsCount==0){
                out.println("Welcome to my webpage");
                hitsCount=1;
            }
            else{
                out.println("Welcome Bake to my page");
                hitsCount+=1;
            }
            application.setAttribute("hitscounter",hitsCount);
        %>
        <p>Your visitor no ::<strong>
                <%=hitsCount%>
            </strong></p>
    </body>
</html>
