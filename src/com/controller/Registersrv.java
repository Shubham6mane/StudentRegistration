package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;

import com.student.bean.Student;
import com.student.dao.StudentDao;

/**
 * Servlet implementation class Registersrv
 */
//@WebServlet("/Registersrv")
public class Registersrv extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		registration();
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome in Registration </h1>");
		
	}
	
	public boolean registration() {
		ServletRequest request = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		Student s = new Student();
		s.setName(name);
		s.setLastname(lastname);
		s.setAddress(address);
		s.setDob(dob);
		s.setUsername(username);
		s.setPassword(password);
		StudentDao sd = new StudentDao();
		sd.register(s);
		return false;
	}
	
	public boolean login() {
		ServletRequest request = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		return false;
	}

}
