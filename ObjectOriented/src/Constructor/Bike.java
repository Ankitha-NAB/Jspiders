package Constructor;

public class Bike {
	//parameterized constructor
	Bike(int cost){
		System.out.println("cost: "+cost);
	}
	public static void main(String[] args) {
		Bike b=new Bike(40000);

	}

}
