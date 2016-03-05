<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html!>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Excel Yolla</title>
</head>
<body>
	<form action="ogrencial" enctype="multipart/form-data" method="post">
		Sınıf: <input type="text" name="sinif"><br/>
		Sıra Sonu: <input type="text" name="satirSonu"><br/>
		Dosya: <input type="file" name="ogrenciListesi"><br/>
		Gönder: <input type="submit" value="Yolla"><br/>
	</form>
</body>
</html>