<%-- 
    Document   : currentTime
    Created on : Mar 29, 2025, 11:33:34 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            java.util.Date d=new java.util.Date();
            out.println("<h2>"+d.toString()+"</h2>");
            
        %>
    </body>
</html>
