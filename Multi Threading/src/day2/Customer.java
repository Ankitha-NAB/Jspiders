package day2;

public class Customer {
public static void main(String[] args) {
	Zomato z=new Zomato();
	z.start();
	Phonepay p=new Phonepay();
	Thread t=new Thread(p);
	t.start();
}
}
