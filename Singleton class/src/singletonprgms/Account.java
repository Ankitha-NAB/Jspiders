package singletonprgms;

public class Account {
private Account() {
	System.out.println("object created");
}
private static Account obj;
public static void createObject() {
	if(obj==null) {
		obj=new Account();
	}
	else {
		System.out.println("object already created");
	}
}
}
