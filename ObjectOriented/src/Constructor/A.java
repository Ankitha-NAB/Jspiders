package Constructor;

public class A {
	A(){
		System.out.println(1);
	}
	A(int x){
		this();
		System.out.println(2);
	}
}
