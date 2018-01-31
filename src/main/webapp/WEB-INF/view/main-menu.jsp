<%--
  Created by IntelliJ IDEA.
  User: shaparenko
  Date: 1/18/18
  Time: 10:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC demo</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/my-test.css">

    <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>
<body>
    <h2>Spring MVC demo - Home page</h2>
    <h2><img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" height="55" width="55"/></h2>
    <hr>
    <a href="hello/showForm">Hello world form</a>
    <br>
    <input type="button" onclick="doSomeWork()" value="Click Me"/>
    <br>
    <br>
    <a href="/student/showForm">Student Form</a>

</body>
</html>
