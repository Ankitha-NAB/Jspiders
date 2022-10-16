package basics;

//pgm without overriding equals() 
//it gives false bcoz by default equals() will compare the addresses of two objects
public class Car {
	int cost;
	Car(int cost){
		this.cost=cost;
	}
	public static void main(String[] args) {
		Car c1=new Car(200);
		Car c2=new Car(200);
		System.out.println(c1.equals(c2));
	}
}
