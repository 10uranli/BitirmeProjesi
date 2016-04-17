package com.oturmaplani.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.oturmaplani.model.Ogrenci;

public final class DBtoExcelUtility {
	  private static FileOutputStream out = null;
	  private static XSSFWorkbook wb = null;
	  private static XSSFSheet sp = null;
	  private static XSSFRow row = null;
	  private static XSSFCell cell = null;

	  public static boolean getExcelFile(ArrayList<Ogrenci> ogrenciListesi, String sinifAdi){
	    wb = new XSSFWorkbook();//XSSF nesnesini tanýmla
	    sp = wb.createSheet();//Sheet veriyi oluþtur.
	    row = sp.createRow(0);//Sütünlarý oluþturmak için nesneyi yarat.
	    cell = row.createCell(0);//Sütünlarý oluþtur.
	    cell.setCellValue("Öðrenci No");//Oluþturulan sütüna ismi ata.
	    cell = row.createCell(1);//Sütünlarý oluþtur.
	    cell.setCellValue("Öðrenci Adý - Soyadý");//Oluþturulan sütüna ismi ata.
	    cell = row.createCell(2);//Sütünlarý oluþtur.
	    cell.setCellValue("Sýnýf Adý");//Oluþturulan sütüna ismi ata.
	    cell = row.createCell(3);//Sütünlarý oluþtur.
	    cell.setCellValue("Sýnav Sýra Numarasý");//Oluþturulan sütüna ismi ata.
	    int i = 1;
	    for (Ogrenci ogrenci: ogrenciListesi) {//ForEach döngüsünü kullan.
	      row = sp.createRow(i);
	      cell = row.createCell(0);//Oluþturulmuþ sütünlara okunan satýrlarý gir.
	      cell.setCellValue(ogrenci.getOgrenciNo());
	      cell = row.createCell(1);//Oluþturulmuþ sütünlara okunan satýrlarý gir.
	      cell.setCellValue(ogrenci.getOgrenciAdi()+ " " + ogrenci.getOgrenciSoyad());
	      cell = row.createCell(2);//Oluþturulmuþ sütünlara okunan satýrlarý gir.
	      cell.setCellValue(ogrenci.getSinifAdi().getSinifAdi());
	      cell = row.createCell(3);//Oluþturulmuþ sütünlara okunan satýrlarý gir.
	      cell.setCellValue(ogrenci.getSira());
	      i++;
	    }
	    try {
	      out = new FileOutputStream(new File("C:\\Users\\onur_\\Desktop\\"+ sinifAdi.toUpperCase() +" SýnavListesi.xlsx"));//Oluþturulan Exceli yaz.
	    } catch (FileNotFoundException e) {
	      // Send Export Error Page "Dosya Bulunamadý " with e.getMessage().toString();
	    }
	    try {
	      wb.write(out);
	    } catch (IOException e) {
	      // Send IO Error Page "Dosyaya var ancak eriþim/yazma hakký yok veya
	      // dosya hiç okunamýyor izinleri kontrol ediniz" with
	      // e.getMessage().toString();
	    }
	    try {
	      out.close();
	    } catch (IOException e) {
	      // Send IO Error Page "Dosyaya eriþim hakký yok." with e.getMessage().toString();
	    }
	    //System.out.println("Successfully exported.");
	    //If there isn't problem, Send Controller Servlet for download excel file.
	    return true;
	}
}