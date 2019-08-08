package com.inputOutput;

import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\deloitte\\record.txt");
		File f1 = new File("C:\\deloitte\\mohan\\student");
		File f2 = new File("C:\\deloitte\\mohan\\stu.txt");
		
		if(f.exists()) {
			f1.mkdirs();
			f2.createNewFile();
			f.delete();
			System.out.println("File and folder created");
		} else {
			f.createNewFile();
			System.out.println("File not found");
		}
		System.out.println("Done");

	}

}
