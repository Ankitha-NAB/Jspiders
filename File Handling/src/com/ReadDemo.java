package com;
import java.io.*;
public class ReadDemo {
public static void main(String[] args) {
	File f=new File("Student.txt");
	try {
		FileReader fr=new FileReader(f);
		int ch=fr.read();
		while(ch!=-1) {
			System.out.print((char)ch);
			ch=fr.read();
		}
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
