<%-- 
    Document   : testjsp
    Created on : Jun 13, 2017, 9:21:46 AM
    Author     : Ravi Kandel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--<p>
            Hello, <%=request.getParameter("user") %>
            
        </p>
        <p>
            My Name is <%=request.getParameter("name") %>
            
        </p>-->
        
        <% for(int a =0; a<10;a++){ %>
        <p>Hello</p>
        <% } %>
    </body>
</html>
