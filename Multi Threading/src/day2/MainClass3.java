package day2;

public class MainClass3 {
public static void main(String[] args) {
	Bike b=new Bike();
	Thread t=new Thread(b);
	t.setName("Bike thread");
	t.start();
	Thread t1=new Thread(new Bike());
	t1.setName("Bike thread");
	t1.start();
	Thread t2=new Thread(new Bike(),"Bike thread");
	t2.start();
	new Thread(new Bike(),"Bike thread").start();
}
}
