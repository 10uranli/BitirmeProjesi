package com.oturmaplani.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
 
import com.oturmaplani.model.Rehber;
 
public class RehberDao {
 
 public Rehber getirId(int id) {
 Rehber r = null;
 try {
 Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/bitirmeprojesi?useUnicode=true&characterEncoding=UTF-8","root", "123456");
 
 
String query = "Select * from rehber where id=?";
 PreparedStatement psmt = conn.prepareStatement(query);
 psmt.setInt(1, id);
 ResultSet rs = psmt.executeQuery();
 
while (rs.next()) {
 r = new Rehber(rs.getInt("id"), rs.getString("adi"),
 rs.getString("soyadi"), rs.getString("mail"),
 rs.getString("tel"));
 }
 
} catch (Exception e) {
 e.printStackTrace();
 }
 return r;
 }
 
 public List<Rehber> getirTumListe() {
 List<Rehber> r = new ArrayList<Rehber>();
 try {
 Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection(
 "jdbc:mysql://localhost:3307/bitirmeprojesi?useUnicode=true&characterEncoding=UTF-8","root", "123456");
 String query = "Select * from rehber";
 PreparedStatement psmt = conn.prepareStatement(query);
 ResultSet rs = psmt.executeQuery();
 
while (rs.next()) {
 Rehber reh = new Rehber(rs.getInt("id"), rs.getString("adi"),
 rs.getString("soyadi"), rs.getString("mail"),
 rs.getString("tel"));
 r.add(reh);
 }
 
} catch (Exception e) {
 e.printStackTrace();
 }
 return r;
 }
 public int kisiEkle(String adi, String soyadi, String mail,
 String tel) {
 try {
 Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection(
 "jdbc:mysql://localhost:3307/bitirmeprojesi?useUnicode=true&characterEncoding=UTF-8","root", "123456");
 
String query = "INSERT INTO rehber (adi,soyadi,mail,tel) VALUES (?,?,?,?)";
 
 PreparedStatement psmt = conn.prepareStatement(query);
 psmt.setString(1, adi);
 psmt.setString(2, soyadi);
 psmt.setString(3, mail);
 psmt.setString(4, tel);
 return psmt.executeUpdate();
 
 }catch (Exception e) {
 e.printStackTrace();
 }
 
 return 0;
 }
 
 public int kisiSil(String id) {
 try {
 Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection(
		 "jdbc:mysql://localhost:3307/bitirmeprojesi?useUnicode=true&characterEncoding=UTF-8","root", "123456");
 
String query = "DELETE FROM rehber where id=?";
 
 PreparedStatement psmt = conn.prepareStatement(query);
 psmt.setString(1, id);
 return psmt.executeUpdate();
 
 }catch (Exception e) {
 e.printStackTrace();
 }
 
 return 0;
 }
 
 public int kisiDuzenle(String id, String adi, String soyadi,
 String mail, String tel) {
 try {
 Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection(
		 "jdbc:mysql://localhost:3307/bitirmeprojesi?useUnicode=true&characterEncoding=UTF-8","root", "123456");
 
String query = "UPDATE rehber SET adi=?,soyadi=?,mail=?,tel=? where id=?";
 
 PreparedStatement psmt = conn.prepareStatement(query);
 psmt.setString(1,adi);
 psmt.setString(2, soyadi);
 psmt.setString(3, mail);
 psmt.setString(4, tel);
 psmt.setInt(5, Integer.valueOf(id));
 return psmt.executeUpdate();
 
 }catch (Exception e) {
 e.printStackTrace();
 }
 
 return 0;
 }
 
}