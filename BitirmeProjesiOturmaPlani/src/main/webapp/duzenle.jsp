<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@page import="com.oturmaplani.model.Rehber"%>
<%@page import="com.oturmaplani.dao.RehberDao"%>
 
<%
 String userId = request.getParameter("id");
 Rehber user = new RehberDao().getirId(Integer
 .valueOf(userId));
 request.setAttribute("user", user);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Duzenleme</title>
</head>
<body>
 
&nbsp;
 
<form action="duzenle" method="post">
 
<table align="center">
 <tr>
 <td>id :</td>
 <td>${user.id}<input type="hidden" name="id"
 value="${user.id}" /></td>
 </tr>
 <tr>
 <td>Adi :</td>
 <td><input type="text" name="adi" value="${user.adi}" /></td>
 </tr>
 <tr>
 <td>Soyadi :</td>
 <td><input type="text" name="soyadi" value="${user.soyadi}" /></td>
 </tr>
 <tr>
 <td>Mail :</td>
 <td><input type="text" name="mail" value="${user.mail}" /></td>
 </tr>
 <tr>
 <td>Tel :</td>
 <td><input type="text" name="tel" value="${user.tel}" /></td>
 </tr>
 <tr>
 <td>&nbsp;</td>
 <td><input type="submit" value="Duzenle"></td>
 </tr>
 </table>
</form>
</body>
</html>