package day1;

public class Demo {
public static void main(String[] args) {
	Thread t=new Thread();
	System.out.println("Thread id:"+t.getId());
	System.out.println("Thread name:"+t.getName());
	System.out.println("Thread Priority:"+t.getPriority());
	System.out.println("-----------------");
	t.setName("Demo Thread");
	t.setPriority(9);
	System.out.println("Thread id:"+t.getId());
	System.out.println("Thread name:"+t.getName());
	System.out.println("Thread Priority:"+t.getPriority());
}
}
