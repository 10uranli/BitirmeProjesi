<%@page import="com.oturmaplani.dao.HocaDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	request.setAttribute("dersListesi", HocaDAO.tumListe());
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,300italic,600|Source+Code+Pro" rel="stylesheet" />
		<!--[if lte IE 8]><script src="html5shiv.js" type="text/javascript"></script><![endif]-->
		<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
		<script src="js/jquery.dropotron.min.js"></script>		
		<script src="js/skel.min.js">
		{
			prefix: 'css/style-aras',
			preloadStyleSheets: true,
			resetCSS: true,
			boxModel: 'border',
			grid: { gutters: 30 },
			breakpoints: {
				wide: { range: '1200-', containers: 1140, grid: { gutters: 50 } },
				narrow: { range: '481-1199', containers: 960 },
				mobile: { range: '-480', containers: 'fluid', lockViewport: true, grid: { collapse: true } }
			}
		}
		</script>
	<title>ÇSOS</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
</head>
<body>
<div id="header_container">		
		    <div class="container">
			<!-- Header -->
				<div id="header" class="row">
					<div class="4u">
						<div class="transparent">
							
						<img src="images/bodybg2.png">
					    </div>
					</div>
					
					<nav id="main-nav" class="8u">
						<ul>
							<li><a class="" href="liste.jsp"><u>Oturma Planı Oluştur</u></a></li>
							<li><a href="hocaaras.html"><u>Hoca-Ders İlişkilendir</u></a></li>
							<li><a href="sinavaras.html"><u>Sınav Takvimi Ekle</u></a></li>
												
						
									</ul>
							</li>
							
						</ul>
					</nav>
				</div>
			</div>	
        </div>		
		
		
		<div id="site_content">
			<div class="container">			
				
			<!-- Features -->
				<div class="row">
					<section class="12u">
						<h2>Mevcut listeyi seçip gerekli alanları doldurunuz!</h2>
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
				Sıra Sonu<input type="text" name="satirSonu"><b ><span  style="color: red;"><b class="text-danger">Exceldeki dolu olan son satırı giriniz!</b></span></b><br />
				<input type="file" name="ogrenciListesi"><br /> 
				gonder<input type="submit"   value="GÖNDER"><br />
			</form>



			
					</section>
				</div>
				<div class="row">	
					<section class="8u">
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
							class="">İndir</a></td>
					</tr>
				</c:forEach>
			</table>
			</section>
										
				</div>
			</div>
        </div>		
		
			<div class="container">			
			<!-- Footer -->
				<footer>
				
				</footer>		
			</div>		
			
	</body>
</body>
</html>


