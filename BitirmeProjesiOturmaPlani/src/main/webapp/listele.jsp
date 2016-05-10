<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@page import="com.oturmaplani.model.Rehber"%>
<%@page import="com.oturmaplani.dao.RehberDao"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
 List<Rehber> rehber = new RehberDao().getirTumListe();
 request.setAttribute("rehber", rehber);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VeriListelemeÖrneği</title>
</head>
<body>
 <table>
 <tr>
 <th>id</th>
 <th>adi</th>
 <th>soyadi</th>
 <th>mail</th>
 <th>tel</th>
 </tr>
 <c:forEach items="${rehber}" var="kisi">
 <tr>
 <td>${kisi.id}</td>
 <td>${kisi.adi}</td>
 <td>${kisi.soyadi}</td>
 <td>${kisi.mail}</td>
 <td>${kisi.tel}</td>
 </tr>
 </c:forEach>
 </table>
</body>
</html>