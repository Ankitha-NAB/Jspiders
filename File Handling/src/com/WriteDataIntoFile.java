package com;
import java.io.*;
public class WriteDataIntoFile {
public static void main(String[] args) {
	File f=new File("Student.txt");
	FileWriter fw=null;
	try {
		fw=new FileWriter(f);
		fw.write("Hello World");
		fw.flush();
		System.out.println("Data stored");
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	finally {
		try {
			fw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
}
