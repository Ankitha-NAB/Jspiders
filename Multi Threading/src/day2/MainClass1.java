package day2;

public class MainClass1 {
public static void main(String[] args) {
	Tom t=new Tom();
	Thread thread=new Thread(t);
	thread.start();
}
}
