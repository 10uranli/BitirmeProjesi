package com.oturmaplani.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.text.WordUtils;

import com.oturmaplani.dao.HocaDAO;
import com.oturmaplani.model.Hoca;

@WebServlet("/hocaListeYolla")
@MultipartConfig(maxFileSize = 4194304)
public class HocaListeEkle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static SecureRandom random = new SecureRandom();
	String state = "";
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		Part file = request.getPart("sinifListesi");
		String dersAdi = WordUtils.capitalize(request.getParameter("dersAdi"));
		
		String sifrelenmisExcelAdi = new BigInteger(130, random).toString(32).substring(0, 5).toUpperCase() + "_" + dersAdi.trim().replace(" ", "_") + ".xlsx";
		Hoca hoca = new Hoca(dersAdi,sifrelenmisExcelAdi);
		
		try {
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File("C:\\Excel\\" + sifrelenmisExcelAdi)));
	        IOUtils.copy(file.getInputStream(), stream);
			stream.close();
			
			HocaDAO.yeniDersKaydet(hoca);
			state = "Excel baþarýyla eklendi!";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			state = "Excel eklenemedi!\nHata: " + e.getMessage();
		}
		
		request.setAttribute("state", state);
		request.getRequestDispatcher("hoca.jsp").forward(request, response);
	}
}
