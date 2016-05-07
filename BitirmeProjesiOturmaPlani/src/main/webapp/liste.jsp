<%@page import="com.oturmaplani.dao.HocaDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	request.setAttribute("dersListesi", HocaDAO.tumListe());
%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="md-12">
			<h2>Mevcut listeyi seçip gerekli alanları doldunuruz!</h2>
			<form action="ogrencial" enctype="multipart/form-data" method="post">
				Sınıf Adı: <input type="text" name="sinifAdi1">
				Sinıf Mevcudu: <input type="text" name="mevcut1"><br />
				Sınıf Adı: <input type="text" name="sinifAdi2">
				Sınıf Mevcudu: <input type="text" name="mevcut2"><br />
				Sınıf Adı: <input type="text" name="sinifAdi3">
				Sınıf Mevcudu: <input type="text" name="mevcut3"><br />
				Sınıf Adı: <input type="text" name="sinifAdi4">
				Sınıf Mevcudu: <input type="text" name="mevcut4"><br />
				Sınıf Adı: <input type="text" name="sinifAdi5">
				Sınıf Mevcudu: <input type="text" name="mevcut5"><br />
				Sıra Sonu: <input type="text" name="satirSonu"><b><span style="color: red;">Exceldeki dolu olan son satırı giriniz!</span></b><br />
				<input type="file" name="ogrenciListesi"><br /> 
				Gönder: <input type="submit" value="Yolla"><br />
			</form>
		</div>
		<div class="md-12">
			<h2>Liste aşağıdadır</h2>
			<table class="table">
				<tr>
					<th>ID</th>
					<th>Ders Adı</th>
					<th>Öğrenci Listesi</th>
					<th></th>
				</tr>
				<c:forEach items="${dersListesi}" var="d">
					<tr class="info">
						<td>${d.hocaId}</td>
						<td>${d.dersAdi}</td>
						<td>${d.excelAdres}</td>
						<td><a href="excelVer?dosyaAdi=${d.excelAdres}"
							class="btn btn-success">İndir</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>