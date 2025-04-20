<%-- 
    Document   : autoRefresh
    Created on : Mar 29, 2025, 12:08:58 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*,java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
               response.setIntHeader("Refresh",1);
               
               Calendar calender=new GregorianCalendar();
               String am_pm;
               
                int hours=calender.get(Calendar.HOUR);
                int min=calender.get(Calendar.MINUTE);
                int sec=calender.get(Calendar.SECOND);
                
                if(calender.get(Calendar.AM_PM)==0){
                    am_pm="AM";
                }else{
                    am_pm="PM";
                }
                String ct=hours+":"+min+":"+sec+""+am_pm;
                out.println("Current time="+ct);
        %>
    </body>
</html>
