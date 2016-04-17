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
	    wb = new XSSFWorkbook();//XSSF nesnesini tan�mla
	    sp = wb.createSheet();//Sheet veriyi olu�tur.
	    row = sp.createRow(0);//S�t�nlar� olu�turmak i�in nesneyi yarat.
	    cell = row.createCell(0);//S�t�nlar� olu�tur.
	    cell.setCellValue("��renci No");//Olu�turulan s�t�na ismi ata.
	    cell = row.createCell(1);//S�t�nlar� olu�tur.
	    cell.setCellValue("��renci Ad� - Soyad�");//Olu�turulan s�t�na ismi ata.
	    cell = row.createCell(2);//S�t�nlar� olu�tur.
	    cell.setCellValue("S�n�f Ad�");//Olu�turulan s�t�na ismi ata.
	    cell = row.createCell(3);//S�t�nlar� olu�tur.
	    cell.setCellValue("S�nav S�ra Numaras�");//Olu�turulan s�t�na ismi ata.
	    int i = 1;
	    for (Ogrenci ogrenci: ogrenciListesi) {//ForEach d�ng�s�n� kullan.
	      row = sp.createRow(i);
	      cell = row.createCell(0);//Olu�turulmu� s�t�nlara okunan sat�rlar� gir.
	      cell.setCellValue(ogrenci.getOgrenciNo());
	      cell = row.createCell(1);//Olu�turulmu� s�t�nlara okunan sat�rlar� gir.
	      cell.setCellValue(ogrenci.getOgrenciAdi()+ " " + ogrenci.getOgrenciSoyad());
	      cell = row.createCell(2);//Olu�turulmu� s�t�nlara okunan sat�rlar� gir.
	      cell.setCellValue(ogrenci.getSinifAdi().getSinifAdi());
	      cell = row.createCell(3);//Olu�turulmu� s�t�nlara okunan sat�rlar� gir.
	      cell.setCellValue(ogrenci.getSira());
	      i++;
	    }
	    try {
	      out = new FileOutputStream(new File("C:\\Users\\onur_\\Desktop\\"+ sinifAdi.toUpperCase() +" S�navListesi.xlsx"));//Olu�turulan Exceli yaz.
	    } catch (FileNotFoundException e) {
	      // Send Export Error Page "Dosya Bulunamad� " with e.getMessage().toString();
	    }
	    try {
	      wb.write(out);
	    } catch (IOException e) {
	      // Send IO Error Page "Dosyaya var ancak eri�im/yazma hakk� yok veya
	      // dosya hi� okunam�yor izinleri kontrol ediniz" with
	      // e.getMessage().toString();
	    }
	    try {
	      out.close();
	    } catch (IOException e) {
	      // Send IO Error Page "Dosyaya eri�im hakk� yok." with e.getMessage().toString();
	    }
	    //System.out.println("Successfully exported.");
	    //If there isn't problem, Send Controller Servlet for download excel file.
	    return true;
	}
}