package com.oturmaplani.utility;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.oturmaplani.model.Ogrenci;
import com.oturmaplani.model.Sinif;

public class ExcelToDBUtility {
	private static FileInputStream input = null;
	private static OPCPackage fs = null;
	private static Workbook wb = null;
	private static Sheet sheet = null;
	private static Row row = null;
	private static int[] siraNumaraListesi = null;

	public static boolean getExcelImportFile(String path, int satirSonu, String sinifAdi) {
		ArrayList<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>();
		try {
			siraNumaraListesi = IntStream.rangeClosed(1, satirSonu -1).toArray();
			siraNumaralariniKaristir(siraNumaraListesi);
			input = new FileInputStream(path);
			fs = OPCPackage.open(input);
			wb = WorkbookFactory.create(fs);
			sheet = wb.getSheetAt(0);
			for (int i = 1; i < satirSonu; i++) {
				Ogrenci ogrenci = new Ogrenci();
				row = (Row) sheet.getRow(i);
				ogrenci.setOgrenciAdi((row.getCell(1) == null) ? "0" : row.getCell(1).toString());
				ogrenci.setOgrenciSoyad((row.getCell(2) == null) ? "0" : row.getCell(2).toString());
				ogrenci.setOgrenciNo((row.getCell(0) == null) ? "0" : row.getCell(0).toString());
				ogrenci.setSinifAdi(new Sinif(sinifAdi));
				ogrenci.setSira(siraNumaraListesi[i-1]);
				ogrenciListesi.add(ogrenci);
			}
			input.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			try {
				if (input != null)
					input.close();
			} catch (Exception exx) {
				exx.printStackTrace();
			}
		}
		DBtoExcelUtility.getExcelFile(ogrenciListesi);
		return false;
	}
	
	public static void siraNumaralariniKaristir(int[] ar) {
		Random rnd = ThreadLocalRandom.current();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}
}