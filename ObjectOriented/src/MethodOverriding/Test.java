package MethodOverriding;

class Father{
	void bike() {
		System.out.println("Old fashioned father's bike");
	}
}

class Son extends Father{
	@Override
	void bike() {
		System.out.println("New fashioned son's bike");
	}
}

public class Test {

	public static void main(String[] args) {
		Son s=new Son();
		s.bike();

	}

}
