package typecasting;
class Father{
	int age=10;
}
class Son extends Father{
	String name="Dinga";
}

public class MainClass {

	public static void main(String[] args) {
		//UPCASTING
		System.out.println("------UPCASTING------");
		Father f=new Son();
		System.out.println(f.age);
		//DOWNCASTING
		System.out.println("-------DOWNCASTING-------");
		Son s=(Son)f;
		System.out.println(s.age+" "+s.name);

	}

}
