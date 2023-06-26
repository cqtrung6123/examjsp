
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Birthday</th>
        <th>Address</th>
        <th>Position</th>
        <th>Department</th>
    </tr>

    <c:forEach var="employee" items="${employees}">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.fullName}</td>
            <td>${employee.birthday}</td>
            <td>${employee.address}</td>
            <td>${employee.positon}</td>
            <td>${employee.department}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
