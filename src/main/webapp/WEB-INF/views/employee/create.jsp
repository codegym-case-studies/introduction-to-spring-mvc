<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Create a new employee</title>
</head>
<body>
<h3>Welcome, Enter The Employee Details</h3>
<form method="post">
    <table>
        <tr>
            <td><label for="id">Employee ID: </label></td>
            <td><input type="text" id="id" name="id" /></td>
        </tr>
        <tr>
            <td><label for="name">Employee's name: </label></td>
            <td><input type="text" id="name" name="name" /></td>
        </tr>
        <tr>
            <td><label for="contactNumber">Contact's number: </label></td>
            <td><input type="text" id="contactNumber" name="contactNumber" /></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>
</body>
</html>