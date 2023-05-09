<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="modeles.Personne" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% Personne p=(Personne)session.getAttribute("personneAuthentifiee"); %>
	<h1>Bienvenue à votre session</h1><br>
	<b>Prénom :</b> <%= p.getPrenom() %><br>
	<b>Nom :</b> <%=p.getNom() %>
</body>
</html>