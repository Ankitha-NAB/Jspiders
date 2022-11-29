package com;
import java.io.*;

public class CreatingNewFolder {
public static void main(String[] args) {
	File f=new File("dinga");
	//File f=new File("e:/dinga");
	boolean result=f.mkdir();
	System.out.println(result);
	
}
}
