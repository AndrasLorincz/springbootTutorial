<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Főoldal</title>
</head>
<body>
<h2>Tutorial Form</h2>

<form action="mentes" method="post">
  <label for="name">Neve:</label><br>
  <input type="text" name="name"><br>
  <input type="submit" value="Mentés">
</form>
<form action="kiir" method="get">
<input type="submit" value="Kiíratás">
</form>
</body>
</html>