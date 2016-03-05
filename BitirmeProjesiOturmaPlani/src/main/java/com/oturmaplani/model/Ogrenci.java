package com.oturmaplani.model;

public class Ogrenci implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private int ogrenciID;
	private int sira;
	private String ogrenciNo;
	private String ogrenciAdi;
	private String ogrenciSoyad;
	private Sinif _sinif;
	
	public Ogrenci(int ogrenciID, String ogrenciNo, int sira, String ogrenciAdi, String ogrenciSoyad, Sinif _sinif) {
		super();
		this.ogrenciID = ogrenciID;
		this.ogrenciNo = ogrenciNo;
		this.sira = sira;
		this.ogrenciAdi = ogrenciAdi;
		this.ogrenciSoyad = ogrenciSoyad;
		this._sinif = _sinif;
	}

	public Ogrenci() {
		super();
	}

	public int getOgrenciID() {
		return ogrenciID;
	}

	public void setOgrenciID(int ogrenciID) {
		this.ogrenciID = ogrenciID;
	}

	public String getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(String ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	public String getOgrenciAdi() {
		return ogrenciAdi;
	}

	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}

	public String getOgrenciSoyad() {
		return ogrenciSoyad;
	}

	public void setOgrenciSoyad(String ogrenciSoyad) {
		this.ogrenciSoyad = ogrenciSoyad;
	}

	public int getSira() {
		return sira;
	}

	public void setSira(int sira) {
		this.sira = sira;
	}

	public Sinif getSinifAdi() {
		return _sinif;
	}

	public void setSinifAdi(Sinif _sinif) {
		this._sinif = _sinif;
	}
}
