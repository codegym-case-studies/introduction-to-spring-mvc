<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<form:form action="login" method="post" modelAttribute="credential">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td><label for="username"> Username:</label></td>
                <td><input name="username" id="username" type="text"/></td>
            </tr>
            <tr>
                <td><label for="password">Password:</label></td>
                <td><input id="password" name="password" type="password"/></td>
            </tr>
            <tr>
                <td></td>
                <td><button type="submit">Login</button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
