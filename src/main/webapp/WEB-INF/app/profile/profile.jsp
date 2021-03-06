<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/app/pageParts/header.jsp" %>
<h1>Twoje konto</h1><br/>
<table border="1">
    <tr>
    <td>Nazwa użytkownika</td>
    <td>${user.username}</td>
    </tr>
    <tr>
        <td>Punkty</td>
        <td>${user.points}</td>
    </tr>
    <tr>
        <td>Data założenia konta</td>
        <td>${user.creationDate}</td>
    </tr>
    <tr>
        <td>Imię</td>
        <td>${user.firstName}</td>
    </tr>
    <tr>
        <td>Nazwisko</td>
        <td>${user.lastName}</td>
    </tr>
</table><br/>
<br/>
<input type="button" value="Edytuj" class="myButton" onclick="location.href='/app/profile/edit'">
<%@ include file="/WEB-INF/app/pageParts/footer.jsp" %>