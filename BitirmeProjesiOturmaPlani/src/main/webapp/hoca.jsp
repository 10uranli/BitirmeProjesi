<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hoca Sınıf Liste Yükleme</title>
</head>
<body>
	<form action="hocaListeYolla" enctype="multipart/form-data" method="post">
		Ders Adı: 	<input name="dersAdi" type="text" required="required"/><br/>
		Liste :		<input name="sinifListesi" type="file"/><br/>
		Gönder: 	<input type="submit" value="Yolla" />
	</form>
	
	<c:if test="${not empty state}">
		<h3>${state}</h3>
	</c:if>
</body>
</html>