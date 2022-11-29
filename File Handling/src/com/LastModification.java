package com;
import java.io.*;
import java.util.Date;
public class LastModification {
public static void main(String[] args) {
	File f=new File("bike.txt");
	long milliSeconds=f.lastModified();
	Date d=new Date(milliSeconds);
	System.out.println(d);
}
}
