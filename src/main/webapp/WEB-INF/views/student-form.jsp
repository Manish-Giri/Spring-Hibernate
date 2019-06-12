<%--
  Created by IntelliJ IDEA.
  User: manishgiri
  Date: 2019-06-12
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
<h2>Student Registration Form</h2>
<hr>
<form:form action="processForm" modelAttribute="student">

    First Name: <form:input path="firstName" />
    <br><br>
    Last Name: <form:input path="lastName" />
    <br><br>
    <input type="submit" value="Submit" />

</form:form>
</body>
</html>
