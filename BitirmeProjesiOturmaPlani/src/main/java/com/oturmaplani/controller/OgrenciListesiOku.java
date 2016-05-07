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
			
			int mevcut1 = 0, mevcut2 = 0, mevcut3 = 0, mevcut4 = 0, mevcut5 = 0;
			
			String sinifAdi1 = request.getParameter("sinifAdi1");
			String sinifAdi2 = request.getParameter("sinifAdi2");
			String sinifAdi3 = request.getParameter("sinifAdi3");
			String sinifAdi4 = request.getParameter("sinifAdi4");
			String sinifAdi5 = request.getParameter("sinifAdi5");
			String _mevcut1 = request.getParameter("mevcut1");
			String _mevcut2 = request.getParameter("mevcut2");
			String _mevcut3 = request.getParameter("mevcut3");
			String _mevcut4 = request.getParameter("mevcut4");
			String _mevcut5 = request.getParameter("mevcut5");
			
			System.out.println(_mevcut4);
			
			
			if((sinifAdi5 != null && _mevcut5 != null && !sinifAdi5.equals("")) && !_mevcut5.equals(""))
				mevcut5 = Integer.parseInt(_mevcut5);
			else
				sinifAdi5 = "Kullanilmayacak!";
			
			if((sinifAdi4 != null && _mevcut4 != null && !sinifAdi4.equals("")) && !_mevcut4.equals(""))
				mevcut4 = Integer.parseInt(_mevcut4);
			else
				sinifAdi4 = "Kullanilmayacak!";
			
			if((sinifAdi3 != null && _mevcut3 != null && !sinifAdi3.equals("")) && !_mevcut3.equals(""))
				mevcut3 = Integer.parseInt(_mevcut3);
			else
				sinifAdi3 = "Kullanilmayacak!";
			
			if((sinifAdi2 != null && _mevcut2 != null && !sinifAdi2.equals("")) && !_mevcut2.equals(""))
				mevcut2 = Integer.parseInt(_mevcut2);
			else
				sinifAdi2 = "Kullanilmayacak!";
			
			if((sinifAdi1 != null && _mevcut1 != null && !sinifAdi1.equals("")) && !_mevcut1.equals(""))
				mevcut1 = Integer.parseInt(_mevcut1);
			else
				sinifAdi1 = "Kullanilmayacak!";
			
			String sinif[] = {sinifAdi1,sinifAdi2,sinifAdi3,sinifAdi4,sinifAdi5};
			int sinifMevcut[] = {mevcut1,mevcut2,mevcut3,mevcut4,mevcut5};
			
			if (ExcelToDBUtility.getExcelImportFile(path, Integer.parseInt(request.getParameter("satirSonu")),sinif,sinifMevcut)) {
				request.setAttribute("stateEkleme", "Excelden verilen baþarýyla sisteme girildi!");
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
