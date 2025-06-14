<%@ page import="java.util.*" %>
<%
    String studentName = (String) request.getAttribute("studentName");
    List<String> list = (List<String>) request.getAttribute("studentList");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Attendance Response</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>

<div class="container">
    <% if (studentName != null) { %>
        <h2> Attendance marked for <%= studentName %></h2>
        <a href="index.html" class="btn">Back to Home</a>
    <% } else if (list != null) { %>
        <h2> Attendance List</h2>
        <ul>
            <% for (String name : list) { %>
                <li><%= name %></li>
            <% } %>
        </ul>
        <a href="index.html" class="btn">Back to Home</a>
    <% } else { %>
        <h2> No data to display.</h2>
    <% } %>
</div>

</body>
</html>
