<%-- 
    Document   : index
    Created on : Jul 23, 2017, 3:50:46 PM
    Author     : Ravi Kandel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Good and Bad News</title>
    </head>
    <body>
        <% String newsPage;
            if (Math.random() < 0.5) {
                newsPage = "goodnews.jsp";
            } else {
                newsPage = "badnews.jsp";
            }
        %>
        <jsp:include page="<%= newsPage%>" flush="true" />
    </body>
</html>
