<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
    <style>
        .error {color:red}
    </style>
</head>
<body>
    <i>Fill out the form. Asterisk (*) means required.</i>
    <form:form action="processForm" modelAttribute="student">
        First name (*): <form:input path="firstName"/>
        <form:errors path="firstName" cssClass="error"/>
        <br><br>
        Last name (*): <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br><br>
        Country:
        <form:select path="company">
            <form:option value="Brazil" label="Brazil"/>
            <form:option value="France" label="France"/>
            <form:option value="Germany" label="Germany"/>
            <form:option value="India" label="India"/>
        </form:select>

        <br><br>
        Sex:
        <%--read options from object--%>
        <form:select path="sex">
                <form:options items="${student.sexOptions}"/>
        </form:select>

        <br><br>
        Country:
        <%--read options from countries.properties--%>
        <form:select path="country">
                <form:options items="${countryOptions}"/>
        </form:select>
        <br>
        <br>
        Java<form:radiobutton path="favoriteLanguage" value="Java"/>
        C#<form:radiobutton path="favoriteLanguage" value="C#"/>
        PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
        C++<form:radiobutton path="favoriteLanguage" value="C++"/>
        <br><br>

        Linux<form:checkbox path="operatingSystems" value="Linux"/>
        Mac<form:checkbox path="operatingSystems" value="Mac"/>
        MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>
        <br><br>

        <input type="submit" value="Submit">

    </form:form>


</body>
</html>