<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>AdminPanel</title>
	<link media="all" rel="stylesheet" type="text/css" href="css/all.css" />
	<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
	<script type="text/javascript">window.jQuery || document.write('<script type="text/javascript" src="js/jquery-1.7.2.min.js"><\/script>');</script>
	<script type="text/javascript" src="js/jquery.main.js"></script>
	<!--[if lt IE 9]><link rel="stylesheet" type="text/css" href="css/ie.css" /><![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VeriEklemeÖrneği</title>
</head>
<body>
<div id="wrapper">
		<div id="content">
			<div class="c1">
				<div class="controls">
					<nav class="links">
						<ul>
							<li><a href="ekle.jsp" class="ico1">Kullanıcı Ekle<span class="num"></span></a></li>
							<li><a href="duzenlesil.jsp" class="ico2">Düzenle-Sil<span class="num"></span></a></li>
							<li><a href="listele.jsp" class="ico3">Kullanıcılar<span class="num"></span></a></li>
							<li><a href="#" class="ico3">Admin Ekle<span class="num"></span></a></li>
						</ul>
					</nav>
					<div class="profile-box">
						<span class="profile">
							<a href="#" class="section">
								<img class="image" src="images/img1.png" alt="image description" width="26" height="26" />
								<span class="text-box">
									Merhaba
									<strong class="name">Hoşgeldin Admin</strong>
								</span>
							</a>
							<a href="#" class="opener">opener</a>
						</span>
						<a href="#" class="btn-on">On</a>
					</div>
				</div>
				<div class="tabs">
					<div id="tab-1" class="tab">
						<article>
							<div class="text-section">
								<h1>KULLANICI EKLE</h1>
								
							</div>
							<ul class="states">
								<form action="ekle" method="post">
 <table align="center">
 <tr>
 <td>Adi :</td>
 <td><input type="text" name="adi" /></td>
 </tr>
 <tr>
 <td>Soyadi :</td>
 <td><input type="text" name="soyadi" /></td>
 </tr>
 <tr>
 <td>Mail :</td>
 <td><input type="text" name="mail" /></td>
 </tr>
 <tr>
 <td>Rol:</td>
 <td>
  <input type="radio" name="tel" value="Admin"> Admin<br>
  <input type="radio" name="tel" value="Ogretim_User" checked>Öğretim Görevlisi <br>
  <input type="radio" name="tel" value="Sorumlu_User" checked>Sorumlu Gözetmen <br>
 
  </td>
 </tr>
 <tr>
 <td>&nbsp;</td>
 <td><input type="submit" value="Ekle"></td>
 </tr>
 </table>
</form>
							</ul>
						</article>
					</div>
					<div id="tab-2" class="tab">
						<article>
							<div class="text-section">
								<h1>Dashboard</h1>
								<p>This is a quick overview of some features</p>
							</div>
							<ul class="states">
								<li class="error">Error : This is an error placed text message.</li>
								<li class="warning">Warning: This is a warning placed text message.</li>
								<li class="succes">Succes : This is a succes placed text message.</li>
							</ul>
						</article>
					</div>
					<div id="tab-3" class="tab">
						<article>
							<div class="text-section">
								<h1>Dashboard</h1>
								<p>This is a quick overview of some features</p>
							</div>
							<ul class="states">
								<li class="error">Error : This is an error placed text message.</li>
								<li class="warning">Warning: This is a warning placed text message.</li>
								<li class="succes">Succes : This is a succes placed text message.</li>
							</ul>
						</article>
					</div>
					
				
					
				</div>
			</div>
		</div>
		<aside id="sidebar">
			<strong class="logo"><a href="#">lg</a></strong>
			<ul class="tabset buttons">
				<li class="active">
					<a href="#tab-1" class="ico1"><span>Kullanıcı Ekle</span><em></em></a>
					<span class="tooltip"><span>Kullanıcı Ekle</span></span>
				</li>
				<li>
					<a href="#tab-2" class="ico2"><span>Düzenle-Sil</span><em></em></a>
					<span class="tooltip"><span>Düzenle-Sil</span></span>
				</li>
				<li>
					<a href="#tab-3" class="ico3"><span>Kullanıcılar</span><em></em></a>
					<span class="tooltip"><span>Kullanıcılar</span></span>
				</li>
				<li>
					<a href="#tab-4" class="ico4"><span>Admin Ekle</span><em></em></a>
					<span class="tooltip"><span>Admin Ekle</span></span>
				</li>
				
			</ul>
			<span class="shadow"></span>
		</aside>
	</div>
</body>
</html>
