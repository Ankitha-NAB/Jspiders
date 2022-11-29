package singletonprgms;

public class Person {
public static void main(String[] args) {
	//->internally PrimeMinister pm=new PrimeMinister();
	PrimeMinister pm=PrimeMinister.getInstance();
	System.out.println("Id:"+pm.id);
	System.out.println("Name:"+pm.name);
}
}
