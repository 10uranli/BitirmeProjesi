package com.oturmaplani.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDatabase {
	public static Connection getConnection() {
		Connection connectStatus = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connectStatus = DriverManager.getConnection("jdbc:mysql://localhost/bitirmeprojesi?useUnicode=true&characterEncoding=UTF-8","root", "123456");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connectStatus;
	}

	public static void kapat(Connection con, PreparedStatement psmt) {
		try {
			if (con != null)
				con.close();
			if (psmt != null)
				psmt.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public static void kapat(Connection con, PreparedStatement psmt, ResultSet rs) {
		try {
			if (con != null)
				con.close();
			if (psmt != null)
				psmt.close();
			if (rs != null)
				rs.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
