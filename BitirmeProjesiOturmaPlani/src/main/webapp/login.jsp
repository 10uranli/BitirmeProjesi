<%@page import="javax.websocket.server.PathParam"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import = "com.google.appengine.api.users.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
UserService userService = UserServiceFactory.getUserService();
userService.createLoginURL(request.getRequestURI());
User user = userService.getCurrentUser();
%>
	<h2>GAE - Integrating Google user account</h2>
	<%
	if (user != null) {
		
		out.println("Welcome, " + user.getNickname());
		out.println(
			"<a href='"
				+ userService.createLogoutURL(request.getRequestURI())
				+ "'> LogOut </a>");

	} else {

		out.println(
			"Please <a href='"
				+ userService.createLoginURL(request.getRequestURI())
				+ "'> LogIn </a>");

	}
	%>
</body>
</html>