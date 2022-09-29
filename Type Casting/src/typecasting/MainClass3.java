package typecasting;
class Mother{//only x
	int x=10;
}
class Son1 extends Mother{//x,y
	int y=20;
}
class Daughter extends Mother{//x,y,z
	int z=30;
}

public class MainClass3 {

	public static void main(String[] args) {
		Mother m=new Mother();
		Son1 s=new Son1();
		Daughter d=new Daughter();
		System.out.println(s instanceof Son1);
		System.out.println(d instanceof Daughter);
		System.out.println(s instanceof Mother);
		System.out.println(d instanceof Mother);
		System.out.println(m instanceof Mother);
		System.out.println(m instanceof Son1);
		System.out.println(m instanceof Daughter);
		System.out.println(new Son1() instanceof Mother);
		System.out.println(new Mother() instanceof Daughter);
	
		

	}

}
