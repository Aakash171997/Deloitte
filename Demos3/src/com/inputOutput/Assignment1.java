package com.inputOutput;

import java.io.File;
import java.io.IOException;

public class Assignment1 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Batch");
		
		if(!file.exists()) {
			file.mkdirs();
			System.out.println("New file created - "+file.getName());
		} else {
			System.out.println("Folder exists - "+file.getName());
			System.out.println("---List Files---");
			
			File[] allFiles = file.listFiles();
			
			for(File temp: allFiles) {
				System.out.print(temp.getName());
				if(temp.isDirectory()) {
					System.out.println("\t is Directory");
				} else if(temp.isFile()) {
					System.out.println("\t is File");
				} else {
					System.out.println("");
				}
			}
			
			System.out.println("---List ends---");
			file = new File("C:\\Batch\\BatchMates.txt");
			
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("New File created - "+file.getName());
			} else {
				System.out.println("File exists - "+file.getName());
							
			}
		}
	}
}
