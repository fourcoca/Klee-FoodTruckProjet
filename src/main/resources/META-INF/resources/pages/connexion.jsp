<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="nav.jsp" %>
<h1>CONNEXION</h1>
<c:url value="/login" var="login"/>
		
		<form:form action="" method="post">
			<label>Email :</label> <input type="text" name="username" />
			<label>Mot de passe:</label> <input type="text" name="password" />
			<input type="submit"/>
		</form:form>
</body>
</html>