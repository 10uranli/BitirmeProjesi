package com.oturmaplani.controller;
 
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import com.oturmaplani.dao.RehberDao;
 
/**
 * Servlet implementation class RehberdenSilServlet
 */
@WebServlet("/sil")
public class SilServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
 
protected void doGet(HttpServletRequest request,
 HttpServletResponse response) throws ServletException, IOException {
 doPost(request, response);
 }
 
protected void doPost(HttpServletRequest request,
 HttpServletResponse response) throws ServletException, IOException {
 String id = request.getParameter("id");
 int durum = new RehberDao().kisiSil(id);
 response.sendRedirect("duzenlesil.jsp");
 }
 
}