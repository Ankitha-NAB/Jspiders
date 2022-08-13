package P2;

public class SimpleInterestWp {
		static void si(double p,double t,double r) {
			System.out.println("Si started");
			double si=p*t*r/100;
			System.out.println(si);
			System.out.println("Si ended");
		}

		public static void main(String[] args) {
			System.out.println("Main started");
			si(2000,2.5,25);
			System.out.println("Main ended");

		}


}
