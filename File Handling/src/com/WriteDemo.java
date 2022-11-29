package com;
import java.io.*;
public class WriteDemo {
public static void main(String[] args) throws Exception {
	File f=new File("pcd.txt");
	FileWriter fw=new FileWriter(f,true);
	fw.write(" meow");
	fw.flush();
	fw.close();
	System.out.println("data stored");
}
}
