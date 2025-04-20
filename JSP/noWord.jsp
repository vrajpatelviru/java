<%-- 
    Document   : noWord
    Created on : Mar 29, 2025, 11:38:15 AM
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
           String s=request.getParameter("num");
           int n=s.length();
           int i=0;
           do{
               char s1=s.charAt(i);
               switch(s1){
               
                   case '0':
                       out.println("<h2>zero</h2>");
                    break;
                    case '1':
                       out.println("<h2>one</h2>");
                    break;
                    case '2':
                       out.println("<h2>two</h2>");
                    break;
                    case '3':
                       out.println("<h2>three</h2>");
                    break;
                    case '4':
                       out.println("<h2>four</h2>");
                    break;
                    case '5':
                       out.println("<h2>five</h2>");
                    break;
                    case '6':
                       out.println("<h2>six</h2>");
                    break;
                    case '7':
                       out.println("<h2>seven</h2>");
                    break;
                    case '8':
                       out.println("<h2>eight</h2>");
                    break;
                    case '9':
                       out.println("<h2>nine</h2>");
                    break;
               }
               i++;
           }while(i<n);
       %>
    </body>
</html>
