<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Taglib Directive Example</title>
</head>
<body>
    <h1>Taglib Directive Example:</h1><hr>
    <c:set var="name" value="Ranjit"></c:set>
    <c:out value="${name}"></c:out>
</body>
</html>
