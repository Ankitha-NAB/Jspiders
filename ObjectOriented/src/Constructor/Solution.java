package Constructor;

public class Solution {

	public static void main(String[] args) {
		Car2 c=new Car2("audi","white");
		System.out.println(c.brand+" "+c.color);
		Bike2 b=new Bike2("Honda",5000);
		System.out.println(b.brand+" "+b.cost);
	}

}
