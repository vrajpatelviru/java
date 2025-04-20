<%-- 
    Document   : operation
    Created on : Mar 29, 2025, 11:48:33 AM
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
           String str="Sardar patel university";
           out.println("<h2>Length</h2>");
           out.println("||"+str+"is"+str.length()+"character <br>");
        
           out.println("original string="+str);
           out.println("<br>");
           
           out.println("Relpace by P with R ");
           out.println(str.replace('p','r'));
       %><br>
        
    </body>
</html>
