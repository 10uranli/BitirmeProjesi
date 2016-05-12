<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html!>
<html>
<head>
  <meta name="google-signin-scope" content="profile email">
    <meta name="google-signin-client_id" content="31605954054-emd16jnmgc50tdi52kvaojfr3kdm6o4r.apps.googleusercontent.com">
    <script src="https://apis.google.com/js/platform.js" async defer></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Giris</title>
	<link rel="stylesheet" type="text/css" href="css/Google_Giris.css" >
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<title>Excel Yolla</title>
</head>
<body>
<h2>&nbspOturma Planı Giriş Ekranı</h2>

<div class = "btn_div">
     <div id="img"><img src="images/omu_logom.png" alt="LOGO"></a></div>

	<div class="g-signin2" data-onsuccess="onSignIn" data-theme="dark">Selammm</div>
	<p></p>
	<p >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspHenüz Giriş Yapmadınız...</p>

</div>


 <script>
    
      function onSignIn(googleUser) {
        // Useful data for your client-side scripts:
        var profile = googleUser.getBasicProfile();
        console.log("ID: " + profile.getId()); // Don't send this directly to your server!
        console.log('Full Name: ' + profile.getName());
        console.log('Given Name: ' + profile.getGivenName());
        console.log('Family Name: ' + profile.getFamilyName());
        console.log("Image URL: " + profile.getImageUrl());
        console.log("Email: " + profile.getEmail());
        //document.write(profile.getEmail());

        
        
        // The ID token you need to pass to your backend:
        var id_token = googleUser.getAuthResponse().id_token;
        console.log("ID Token: " + id_token);
      };
    </script>
    
  

<div class="footer">


	
</div>
</body>
</html>