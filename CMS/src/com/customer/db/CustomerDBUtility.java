package com.customer.db;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CustomerDBUtility {
	public static Connection dbConnect() throws SQLException {
		
		FileReader reader;
		Properties dbConfig = new Properties();
		try {
			reader = new FileReader("Config\\db.properties");
			dbConfig.load(reader);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try {	
			Class.forName(dbConfig.getProperty("driver"));
			System.out.print("Driver Loaded... ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		Connection conn = DriverManager.getConnection(
				dbConfig.getProperty("url"), 
				dbConfig.getProperty("username"), 
				dbConfig.getProperty("password"));
		
		System.out.println("Connected to DB");
		return conn;
	}
}
