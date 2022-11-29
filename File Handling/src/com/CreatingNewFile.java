package com;
import java.io.*;
public class CreatingNewFile {
public static void main(String[] args) {
	File f=new File("student.txt");
	try {
		boolean result=f.createNewFile();
		System.out.println(result);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	
}
}
