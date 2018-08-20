<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<form:form method="post" modelAttribute="credential">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td><form:label path="username"> Username:</form:label></td>
                <td><form:input path="username"/></td>
            </tr>
            <tr>
                <td><form:label path="password">Password:</form:label></td>
                <td><form:input path="password"/></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button type="submit">Login</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
