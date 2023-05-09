<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>affichage d'un client</title>
</head>
<body>
<jsp:useBean id="client" class="modeles.clientBean" scope="session"></jsp:useBean>
<h2>Nom:
<jsp:getProperty name="client" property="nom" />
</h2>
<h2>Prenom:
<jsp:getProperty name="client" property="prenom" />
</h2>
<h2>Adresse:
<jsp:getProperty name="client" property="adresse" />
</h2>
<h2>Téléphone:
<jsp:getProperty name="client" property="telephone" />
</h2>
<h2>Email:
<jsp:getProperty name="client" property="email" />
</h2>

</body>
</html>