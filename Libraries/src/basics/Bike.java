package basics;

//example for eauals()
public class Bike {
	String brand;
	int cost;
	Bike(String brand,int cost){
		this.brand=brand;
		this.cost=cost;
	}
	public boolean equals(Object obj) {
		Bike b=(Bike)obj;
		return this.brand.equals(b.brand)&& this.cost==b.cost;
	}
	public static void main(String[] args) {
		Bike b1=new Bike("duke",35000);
		Bike b2=new Bike("duke",35000);
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(new Bike("yamaha",35000)));
		System.out.println(new Bike("duke",35000).equals(b2));
		System.out.println("-----------");
		if(b1.equals(b2)) {
			System.out.println("brand and cost are same");
		}
		else {
			System.out.println("brand and cost are different");
		}
	}

}
