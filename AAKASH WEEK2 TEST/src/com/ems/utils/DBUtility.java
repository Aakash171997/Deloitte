package com.ems.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {
	public static Connection dbConnect() {
		FileReader reader;
		Properties dbConfig = new Properties();
		
		try {
			reader = new FileReader("C:\\deloitte\\Config\\db.properties");
			dbConfig.load(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Class.forName(dbConfig.getProperty("driver"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(
					dbConfig.getProperty("url"), 
					dbConfig.getProperty("username"), 
					dbConfig.getProperty("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
