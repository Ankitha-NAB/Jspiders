package com;
import java.io.*;
public class RenameFile {
public static void main(String[] args) {
	File f1=new File("car.txt");
	File f2=new File("Bike.txt");
	System.out.println(f1.renameTo(f2));
}
}
