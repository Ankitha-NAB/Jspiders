package typecasting;

public class Test {

	public static void main(String[] args) {
		//WIDENING
		System.out.println("--------WIDENING--------");
		int x=10;
		double y=x;
		System.out.println(y);
		char i='A';
		int j=i;
		System.out.println(j);
		//NARROWING
		System.out.println("--------NARROWING---------");
		double b=12.00;
		int c= (int)b;
		System.out.println(c);
		int d=99;
		char e=(char)d;
		System.out.println(d+" "+e);
		System.out.println((int)78.8);
		System.out.println((char)72);

	}

}
