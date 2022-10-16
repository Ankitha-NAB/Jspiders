package basics;

//pgm with after overriding equals() by the rules of upcasting,downcasting,comparision logic
public class Car1 {
	int cost;
	Car1(int cost){
		this.cost=cost;
	}
	public boolean equals(Object obj) {//upcasting
		Car1 c=(Car1)obj;//downcasting
		return this.cost==c.cost;//c1.cost==c2.cost;
	}
	public static void main(String[] args) {
		Car1 c1=new Car1(200);
		Car1 c2=new Car1(200);
		System.out.println(c1.equals(c2));//c1.equals(new Car1(200));
	}
}
