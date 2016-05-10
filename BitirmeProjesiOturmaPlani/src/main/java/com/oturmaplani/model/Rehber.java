package com.oturmaplani.model;

public class Rehber {
 
int id;
 String adi;
 String soyadi;
 String mail;
 String tel;
 public Rehber() {
 }
 public Rehber(int id, String adi, String soyadi, String mail, String tel) {
 this.id = id;
 this.adi = adi;
 this.soyadi = soyadi;
 this.mail = mail;
 this.tel = tel;
 }
 public int getId() {
 return id;
 }
 public void setId(int id) {
 this.id = id;
 }
 public String getAdi() {
 return adi;
 }
 public void setAdi(String adi) {
 this.adi = adi;
 }
 public String getSoyadi() {
 return soyadi;
 }
 public void setSoyadi(String soyadi) {
 this.soyadi = soyadi;
 }
 public String getMail() {
 return mail;
 }
 public void setMail(String mail) {
 this.mail = mail;
 }
 public String getTel() {
 return tel;
 }
 public void setTel(String tel) {
 this.tel = tel;
 }
 
 @Override
 public String toString() {
 
 return adi+" "+soyadi+" "+mail+" "+tel;
 }
 
}