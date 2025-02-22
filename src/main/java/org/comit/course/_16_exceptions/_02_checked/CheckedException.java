package org.comit.course._16_exceptions._02_checked;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {

	void process() {
		//1. open the file
		//2. read the file
		//3. close the file
		
		BufferedReader file = null;
		
		try {
			file = File.open("testfile.txt"); //FileNotFoundException
			
			String line = null;
			while( (line = File.read(file)) != null) {
				System.out.println(line);
			}
		} catch(FileNotFoundException ex) {
			System.out.println("File not found.");
		} catch(IOException ex) {
			System.out.println("Error while reading the file.");
		} finally {
			File.close(file);
		}
	}
	
	public static void main(String[] args) {
		CheckedException obj = new CheckedException();
		obj.process();

	}

}
