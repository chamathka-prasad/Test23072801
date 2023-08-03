<%--
  Created by IntelliJ IDEA.
  User: chama
  Date: 7/28/2023
  Time: 8:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/main.css"/>
</head>
<body>

<h1>log in index</h1>

<form method="post" action="login">
<table>
    <tr>
        <th>user name</th>
       <td><input type="text" name="email"></td>
    </tr>
    <tr>
        <th>password/th>
        <td><input type="password" name="password"></td>
    </tr>

    <tr>
        <th>/th>
        <td><input type="submit" name="login"></td>
    </tr>
</table>

</form>

</body>
</html>
