package com.oturmaplani.model;

public class Sinif implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private int sinifID;
	private String sinifAdi;
	private int kontenjan;
	
	public Sinif(){
		super();
	}
	public Sinif(String sinifAdi){
		super();
		this.sinifAdi = sinifAdi;
	}
	public Sinif(int sinifID, String sinifAdi, int kontenjan) {
		super();
		this.sinifID = sinifID;
		this.sinifAdi = sinifAdi;
		this.kontenjan = kontenjan;
	}

	public int getSinifID() {
		return sinifID;
	}

	public void setSinifID(int sinifID) {
		this.sinifID = sinifID;
	}

	public String getSinifAdi() {
		return sinifAdi;
	}

	public void setSinifAdi(String sinifAdi) {
		this.sinifAdi = sinifAdi;
	}

	public int getKontenjan() {
		return kontenjan;
	}

	public void setKontenjan(int kontenjan) {
		this.kontenjan = kontenjan;
	}
}
