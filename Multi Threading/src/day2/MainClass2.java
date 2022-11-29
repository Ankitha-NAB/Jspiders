package day2;

public class MainClass2 {
public static void main(String[] args) {
	Jspiders j=new Jspiders();
	Thread t=new Thread(j);
	t.start();
}
}
