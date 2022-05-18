package com.student.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLManager {
	public static Connection getConnection() {
		Connection con = null;
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","khiladi");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
