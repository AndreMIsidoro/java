package com.andre.isidoro.testDB;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestDbServlet")
public class TestDB extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	private static final String USER = "springstudent";
	private static final String PASSWORD = "springstudent";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezoneUTC&allowPublicKeyRetrieval=true";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter out = response.getWriter();
			out.println("Connecting to database: " + JDBC_URL);
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
			out.print("Connection successfull");
			connection.close();
		}catch(Exception e) {
		}
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("Connecting to database: " + JDBC_URL);
		Class.forName(DRIVER);
		Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
		System.out.print("Connection successfull");
		connection.close();
	}

}
