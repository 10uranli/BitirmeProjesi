package com.oturmaplani.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.oturmaplani.model.Hoca;

public class HocaDAO {
	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static ResultSet rs = null;
	
	public static ArrayList<Hoca> tumListe(){
		ArrayList<Hoca> sinifListesi = new ArrayList<Hoca>();
		String sql = "SELECT * FROM Hoca";
		try {
			con = ConnectionDatabase.getConnection();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()){
				sinifListesi.add(new Hoca(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionDatabase.kapat(con, psmt, rs);
		}
		return sinifListesi;
	}
	
	public static boolean yeniDersKaydet(Hoca hoca){
		boolean state = false;
		String sql = "INSERT INTO HOCA(dersAdi,excelAdres) VALUES(?,?)";
		try {
			con = ConnectionDatabase.getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setString(1, hoca.getDersAdi());
			psmt.setString(2, hoca.getExcelAdres());
			state = psmt.executeUpdate() > 0 ? true : false;
			con.close();
		} catch (SQLException e) {
		}finally {
			ConnectionDatabase.kapat(con, psmt);
		}
		return state;
	}
}
