package Constructor;

public class Car {
	//non parameterized constructor
	Car(){
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		System.out.println("start");
		Car c=new Car();
		System.out.println("end");
	}

}
