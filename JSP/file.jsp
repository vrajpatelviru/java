<%-- 
    Document   : file
    Created on : Mar 29, 2025, 11:54:21 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.oreilly.servlet.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            MultipartRequest m=new MultipartRequest(request,"c:");

            out.println("<h1>file uploaded ");
        %>
    </body>
</html>
