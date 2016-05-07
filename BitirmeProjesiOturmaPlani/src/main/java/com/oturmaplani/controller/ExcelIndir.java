package com.oturmaplani.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/excelVer")
public class ExcelIndir extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String dosyaAdi = request.getParameter("dosyaAdi");
		
		response.setContentType("application/ms-excel; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(dosyaAdi, "UTF-8"));
		
		OutputStream out = response.getOutputStream();
		FileInputStream in = new FileInputStream("C:\\Excel\\" + dosyaAdi);
		
		byte[] buffer = new byte[1024];
		int length;
		while ((length = in.read(buffer)) > 0){
		    out.write(buffer, 0, length);
		}
		in.close();
		out.flush();
	}
}
