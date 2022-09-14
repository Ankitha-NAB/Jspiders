package MethodOverriding;

class Vehicle{
	void start() {
	System.out.println("Vechile is started");
}
}

class Car extends Vehicle{
	@Override
	void start() {
		super.start();
		System.out.println("Car is started");
	}
}


public class Test1 {

	public static void main(String[] args) {
		Car c=new Car();
		c.start();

	}

}
