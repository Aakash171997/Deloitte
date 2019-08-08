package com.deloitte.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CustomerDBUtility {
	public static Connection dbConnect() {
		
		FileReader reader;
		Properties dbConfig = new Properties();
		try {
			reader = new FileReader("C:\\deloitte\\Config\\db.properties");
			dbConfig.load(reader);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try {	
			Class.forName(dbConfig.getProperty("driver"));
//			System.out.print("Driver Loaded... ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		Connection conn=null;
		try {
			conn = DriverManager.getConnection(
					dbConfig.getProperty("url"), 
					dbConfig.getProperty("username"), 
					dbConfig.getProperty("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println("Connected to DB");
		return conn;
		
	}
}
