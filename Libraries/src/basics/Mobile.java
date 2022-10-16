package basics;


public class Mobile {
	String brand;
	int cost;
	Mobile(String brand,int cost){
		this.brand=brand;
		this.cost=cost;
	}
	public boolean equals(Object obj) {
		Mobile m=(Mobile)obj;
		return this.brand.equals(m.brand) && this.cost==m.cost;
	}
	public static void main(String[] args) {
		Mobile m1=new Mobile("Apple",40000);
		Mobile m2=new Mobile("Apple",40000);
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(new Mobile("Apple",45000)));
		System.out.println(new Mobile("Apple",40000).equals(m2));
		System.out.println("---------");
		if(m1.equals(m2)) {
			System.out.println("brand and cost are same");
		}
		else {
			System.out.println("brand and cost are deifferent");
		}
	}
}
