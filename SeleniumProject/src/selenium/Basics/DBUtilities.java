package selenium.Basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilities {
	
	//Creating private static obj of Connection class
	private static Connection conn;
	
	//Creating private static obj of Statement class
	private static Statement stmt;
	
	//Creating private static obj of ResultSet class
	//it is used to create a resultSet to store query result.
	private static ResultSet resultSet;
	
	//create databade url (class (global) objects)
	
	//syntax for db url connection or url string
	//jdbc:typeofdatabase://host:port/databasename
	
	private static String dbURL = "jdbc:postgresql://localhost:5432/DVDRENTAL";
	
	//create database User Name
	
	private static String dbUserName = "postgres";
	
	//create databade User Password
	
	private static String dbUserPassword = "root";
	
	//create SQL query
	
	private static String dbQuery = "select * from public.actor";
	
	//This method creates connection with the database
	
	public static void setupConnection() {
	try {
		conn = DriverManager.getConnection(dbURL, dbUserName, dbUserPassword );
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
}
	//this method will execute the connection with DB
	
	public static void runQuery() {
		try {
			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(dbQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.printf("%-10s %-10s %-10s\n", "Name", "Last Name","update");
		
		try {
			while(resultSet.next()) {
				System.out.printf("%-10s %-10s %-10s\n", resultSet.getString("first_name"),resultSet.getString("last_name"),resultSet.getString("last_update"));
			}
			
		}catch(SQLException e) {
			

		}
		
	}
	
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}
		
	}
	
	

