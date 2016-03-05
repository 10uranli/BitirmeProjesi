package com.oturmaplani.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.FilenameUtils;

import com.oturmaplani.utility.ExcelToDBUtility;

@WebServlet("/ogrencial")
@MultipartConfig(maxFileSize = 4194304)
public class OgrenciListesiOku extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String path = "C:\\Users\\onur_\\Desktop\\yeniTabanPuan.xlsx";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part excel = request.getPart("ogrenciListesi");
		if (FilenameUtils.getExtension(excel.getSubmittedFileName()).equals("xlsx")) {
			excel.write(path);
			if (ExcelToDBUtility.getExcelImportFile(path, Integer.parseInt(request.getParameter("satirSonu")),request.getParameter("sinif"))) {
				request.setAttribute("stateEkleme", "Excelden verilen baþarýyla sisteme girildi.");
				request.getRequestDispatcher("tabanpuan").forward(request, response);
			} else {
				request.setAttribute("stateEkleme", "Excel okunurken hata ile karþýlaþýldý.Lütfen dosya içeriðini kontrol ediniz!");
				request.getRequestDispatcher("tabanpuan").forward(request, response);
			}
		} else {
			request.setAttribute("stateEkleme", "Sisteme sadece 2007 ve üstü .xlsx uzantýlý excel yükleyebilirsiniz.");
			request.getRequestDispatcher("tabanpuan").forward(request, response);
		}
	}
}
