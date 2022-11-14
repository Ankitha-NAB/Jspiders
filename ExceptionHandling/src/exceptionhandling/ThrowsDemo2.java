package exceptionhandling;
import java.io.*;

public class ThrowsDemo2 {
static void display() throws Exception{//throws InterruptedException
	for(int i=1;i<=5;i++) {
		System.out.println(i);
		Thread.sleep(1000);
	}
}
public static void main(String[] args) {
	try {
		display();
	}
	catch(Exception e) {
		System.out.println("handled");
	}
}
}
