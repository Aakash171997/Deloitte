package com.fileCoppier;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		//Args check
		if(args.length == 0) {
			System.out.println("Please enter the file names as src and dest");
			System.exit(0);
		} else if(args.length == 1) {
			System.out.println("One of the arguments is missing");
			System.exit(0);
		} else {
			File file = new File(args[0]);
			
			if(!file.exists()) {
				System.out.println("Source file does not exist");
				System.exit(0);
			} else {
				FileReader reader = new FileReader(file);
				FileWriter writer = new FileWriter(args[1]);
				
				int i = 0;
				
				while((i = reader.read()) != -1) {
					writer.write((char)i);
				}
				
				System.out.println("File Copy successfull!");
				
				reader.close();
				writer.close();
			}
		}

	}

}
