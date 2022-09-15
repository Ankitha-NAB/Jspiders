package Constructor;

public class B extends A {
	B(double x){
		this("hai");
		System.out.println(3);
	}
	B(String x){
		super(10);
		System.out.println(4);
	}
}
