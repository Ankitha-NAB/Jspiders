package constructors;

public class Vehicle {
	//constructor overloading
	
	Vehicle(String brand,int cost){
		System.out.println("brand: "+brand+" Cost: "+cost);
	}
	
	Vehicle(String brand){
		System.out.println("Brand: "+brand);
	}
	
	Vehicle(String brand,String fuel){
		System.out.println("Brand: "+brand+" Fuel: "+fuel);
	}
	
	Vehicle(int cost,String brand){
		System.out.println("Cost: "+cost+" Brand: "+brand);
	}

	public static void main(String[] args) {
		Vehicle v1=new Vehicle("BMW");
		Vehicle v2=new Vehicle("Audi",45000);
		Vehicle v3=new Vehicle(8999,"Suzuki");
		Vehicle v4=new Vehicle("Honda","Petrol");

	}

}
