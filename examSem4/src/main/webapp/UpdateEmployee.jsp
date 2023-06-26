<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 6/26/2023
  Time: 7:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Update</title>
</head>
<body>
<div align="center">

        <form action="/UpdateEmployee" method="post">

            <table border="1" cellpadding="5">
                <tr>
                    <th>Full Name: </th>
                    <td>
                        <input type="text" name="fullname" size="45" required value="<c:out value='${employee.fullName}'/>"
                        />
                    </td>
                </tr>
                <tr>
                    <th>birthday: </th>
                    <td>
                        <input type="date" name="birthday" size="45" required value="<c:out value='${employee.birthday}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Address: </th>
                    <td>
                        <input type="text" name="address" size="5" required value="<c:out value='${employee.address}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Positon: </th>
                    <td>
                        <input type="text" name="position" size="5" required value="<c:out value='${employye.position}'/>"
                        />
                    </td>
                </tr>
                <tr>
                    <th>Department: </th>
                    <td>
                        <input type="text" name="department" size="5" required value="<c:out value='${employee.department}' />"
                        />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Save" />
                    </td>
                </tr>
            </table>
        </form>
</div>
</body>
</html>
