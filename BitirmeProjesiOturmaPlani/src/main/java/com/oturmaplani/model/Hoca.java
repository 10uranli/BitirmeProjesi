package com.oturmaplani.model;

public class Hoca {
	private int hocaId;
	private String dersAdi;
	private String excelAdres;

	public Hoca() {
		super();
	}

	public Hoca(String dersAdi, String excelAdres) {
		super();
		this.dersAdi = dersAdi;
		this.excelAdres = excelAdres;
	}

	public Hoca(int hocaId, String dersAdi, String excelAdres) {
		super();
		this.hocaId = hocaId;
		this.dersAdi = dersAdi;
		this.excelAdres = excelAdres;
	}

	public int getHocaId() {
		return hocaId;
	}

	public void setHocaId(int hocaId) {
		this.hocaId = hocaId;
	}

	public String getDersAdi() {
		return dersAdi;
	}

	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}

	public String getExcelAdres() {
		return excelAdres;
	}

	public void setExcelAdres(String excelAdres) {
		this.excelAdres = excelAdres;
	}
}
