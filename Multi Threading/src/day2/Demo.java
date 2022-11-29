package day2;

public class Demo {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	System.out.println("Id:"+t.getId());
	System.out.println("Name:"+t.getName());
	System.out.println("Priority:"+t.getPriority());
}
}
