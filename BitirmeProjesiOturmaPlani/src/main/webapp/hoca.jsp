<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/style.css" type="text/css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hoca Sınıf Liste Yükleme</title>
</head>
<body>
	<div id="header">
		<div class="wrapper clearfix">
			<div id="logo">
				<img src="images/logomuz.JPG" alt="LOGO">	&nbsp&nbspÇİSOS
			</div>
			<ul id="navigation">
				<li class="selected">
					<a href="hoca.jsp">Giris</a>
				</li>
				<li>
					<a href="sinav.html">Sınav Takvimi</a>
				</li>

				<li>
					<a href="tanitim.html">Tanıtım</a>
				</li>
			
				<li>
					<a href="iletisim.html">İletişim</a>
				</li>
			</ul>
		</div>
			</div>
			
			
		</div>

		<div class="body clearfix">
		


<form class = "form_dizayn" action="hocaListeYolla" enctype="multipart/form-data" method="post">

  <div class="form-group">

 <div class = "logom"><a href="hoca.jsp"><img src="images/omu_logom.png" alt="LOGO"></a></div>
   <div class = "form_group2"><h2>Oturma Planı Sistemi</h2></div>
    <label for="exampleInputEmail1">Ders Adı</label>
    <input class="form-control" name="dersAdi" id="exampleInputEmail1" placeholder="..." type="text" required="required"/><br/>
  </div>

 

  <div class="form-group">
    <label for="exampleInputFile">Dosya Seçiniz</label>
    <input name="sinifListesi" type="file" id="exampleInputFile"/><br/>
    <p class="help-block">Ders adı ile Excel'i Sisteme Yükleyiniz..</p>
  </div>
 
  <input type="submit" class="btn btn-warning value="Yolla" />
  
  
</form>


	<c:if test="${not empty state}">
		<h3 style="text-align:center">${state}</h3>
	</c:if>


			<p style="font-size:12px;">
				
			</p>
		</div>
	</div>
	<div id="footer">
		<ul id="featured" class="wrapper clearfix">
			<li>
				<img src="images/anfim.jpg" alt="Img" height="204" width="220">
				<h3><a href="hoca.jsp">Giris</a></h3>
				<p>
					
				</p>
			</li>
			<li>
				<img src="images/sinav.jpg" alt="Img" height="204" width="220">
				<h3><a href="sinav.html">Sınav Takvimi</a></h3>
				<p>
			
				</p>
			</li>
			<li>
				<img src="images/proje4.jpg" alt="Img" height="204" width="220">
				<h3><a href="tanitim.html">Tanıtım</a></h3>
				<p>
					
				</p>
			</li>
			<li>
				<img src="images/iletisim2.jpg" alt="Img" height="204" width="220">
				<h3><a href="iletisim.html">İletişim</a></h3>
				<p>
					
				</p>
			</li>
		</ul>
		<div class="body">
			<div class="wrapper clearfix">
				<div id="links">
					<div>
						<h4>Sosyal</h4>
						<ul>
							<li>
								<a href="http://www.omu.edu.tr/tr" target="_blank">On Dokuz Mayıs Üniversitesi</a>
							</li>
							<li>
								<a href="http://mf.omu.edu.tr/" target="_blank">Mühendislik Fakültesi</a>
							</li>
							<li>
								<a href="http://yakin.omu.edu.tr/login/index.php" target="_blank">Yakin Omü Sistemi</a>
							</li>
						</ul>
					</div>
				
				
				<p class="footnote">
					© ÇİSOS
				</p>
			</div>
		</div>
	</div>
</body>
</html>








