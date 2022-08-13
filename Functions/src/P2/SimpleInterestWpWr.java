package P2;

public class SimpleInterestWpWr {
	static double si(double p,double t,double r) {
		System.out.println("Si started");
		double si=p*t*r/100;
		return si;
	}

	public static void main(String[] args) {
		System.out.println("Main started");
		System.out.println(si(2000,2.5,25));
		System.out.println("Main ended");

	}

}