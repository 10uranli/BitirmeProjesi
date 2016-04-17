<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html!>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Excel Yolla</title>
</head>
<body>
	<form action="ogrencial" enctype="multipart/form-data" method="post">
		MF104 Sinıf Mevcudu: <input type="text" name="mevcut1"><br/>
		MF105 Sınıf Mevcudu: <input type="text" name="mevcut2"><br/>
		MF106 Sınıf Mevcudu: <input type="text" name="mevcut3"><br/>
		MF107 Sınıf Mevcudu: <input type="text" name="mevcut4"><br/>
		Sıra Sonu: <input type="text" name="satirSonu"><br/>
		Dosya: <input type="file" name="ogrenciListesi"><br/>
		Gönder: <input type="submit" value="Yolla"><br/>
	</form>
</body>
</html>