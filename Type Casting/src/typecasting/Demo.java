package typecasting;

public class Demo {
public static void main(String[] args) {
	//WIDENING
	int a=10;
	double b=a;
	System.out.println(b);
	char c='A';
	int d=c;
	System.out.println(d);
	System.out.println("--------");
	
	//NARROWING
	double x=12.9;
	int y=(int)x;
	System.out.println(y);
	
}
}
