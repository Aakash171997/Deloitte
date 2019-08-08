package com.collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Props {

	public static void main(String[] args) {
		Properties properties = new Properties();
		
		try {
			FileReader reader = new FileReader("c:\\deloitte\\myprops.properties");
			properties.load(reader);
			
			System.out.println(properties.get("username"));
			System.out.println(properties.get("password"));
			System.out.println(properties.get("url"));
			System.out.println(properties.get("driver"));

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
