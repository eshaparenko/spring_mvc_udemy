<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Confirmation Page</title>
</head>
<body>
    The student has confirmed: ${student.firstName} ${student.lastName}
<br>
<br>
Country: ${student.country}
<br>
<br>
Favourite language: ${student.favoriteLanguage}
<br>
<br>
Sex: ${student.sex}
<br>
<br>
Company: ${student.company}
<br><br>
Operating systems:
<%--<ul>--%>
    <%--<c:forEach var="temp" items="${student.operatingSystems}">--%>
    <%--<li>${temp}</li>--%>
    <%--</c:forEach>--%>
<%--</ul>--%>
</body>
</html>
