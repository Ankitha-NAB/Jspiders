package com;
import java.io.*;
public class FilePresentOrNot {
public static void main(String[] args) {
	File f=new File("dinga");
	System.out.println(f.exists());
	f.delete();
	System.out.println(f.exists());
}
}
