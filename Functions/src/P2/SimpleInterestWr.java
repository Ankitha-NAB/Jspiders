package P2;

public class SimpleInterestWr {
	static double si() {
		System.out.println("Si started");
		double p=2000;
		double t=2.5;
		double r=25;
		double si=p*t*r/100;
		System.out.println(si);
		System.out.println("Si ended");
		return si;
	}

	public static void main(String[] args) {
		System.out.println("Main started");
		si();
		System.out.println("Main ended");

	}

}