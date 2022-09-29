package typecasting;

public class Solution {
	//1. Mother m=new Daughter();
	//2. Mother m=new Son();
	static void display(Mother m) {
		if(m instanceof Son1) {
			System.out.println("downcasting to son");
			Son1 s=(Son1)m;
			System.out.println(s.x+" "+s.y);
		}
		else if(m instanceof Daughter) {
			System.out.println("Downcasting to daughter");
			Daughter d=(Daughter)m;
			System.out.println(d.x+" "+d.z);
		}
	}

	public static void main(String[] args) {
		display(new Daughter());
		display(new Son1());

	}

}
