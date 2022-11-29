package singletonprgms;

public class Person1 {
public static void main(String[] args) {
	//AdhaarNo ac=new AdhaarNo(};
	AdhaarNo ac=AdhaarNo.getInstance();
	System.out.println("Name:"+ac.name);
	System.out.println("Adhaar No:"+ac.adhaarNo);
}
}