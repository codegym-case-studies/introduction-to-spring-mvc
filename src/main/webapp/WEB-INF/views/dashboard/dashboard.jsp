<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
<h1>Welcome</h1>
<table>
    <tr>
        <td><b>Account: </b></td>
        <td>${profile.username}</td>
    </tr>
    <tr>
        <td><b>Name: </b></td>
        <td>${profile.name}</td>
    </tr>
    <tr>
        <td><b>Email: </b></td>
        <td>${profile.email}</td>
    </tr>
    <tr>
        <td><b>Age: </b></td>
        <td>${profile.age}</td>
    </tr>
</table>
</body>
</html>