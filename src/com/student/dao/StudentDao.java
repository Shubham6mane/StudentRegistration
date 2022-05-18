package com.student.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.student.bean.Student;
import com.student.db.SQLManager;

public class StudentDao {
	public boolean register(Student sb) {
		Statement st =null;
		try {
			getClass().forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			 st = SQLManager.getConnection().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int result = st.executeUpdate("insert into student(name,lastname,address,dob,username,password) values("+sb.getName()+","+sb.getLastname()+","+sb.getAddress()+","+sb.getDob()+","+sb.getUsername()+","+sb.getPassword());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	

}
