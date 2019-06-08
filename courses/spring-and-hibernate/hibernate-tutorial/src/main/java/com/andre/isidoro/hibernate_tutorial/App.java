package com.andre.isidoro.hibernate_tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String MY_SQL_JDBC_URL = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezoneUTC&allowPublicKeyRetrieval=true"; 
	private static final String USER = "hbstudent";
	private static final String PASS = "hbstudent";
	
    public static void main( String[] args ) throws SQLException
    {
        System.out.println("Connecting to database: " + MY_SQL_JDBC_URL);
        Connection myConnection = DriverManager.getConnection(MY_SQL_JDBC_URL , USER , PASS);
        System.out.println("Connection success");
    }
}
