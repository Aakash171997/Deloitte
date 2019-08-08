package com.inputOutput;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		File file = new File("first.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("Hello!");
		fw.close();
		if(file.exists()) {
			System.out.println("reading from file");
			FileReader fr = new FileReader(file);
			int i = 0;

			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			
			fr.close();
		}
		
	}

}
