package P2;

public class SquareWpWr {
	static int sq(int a){
		System.out.println("Square started");
		int b=a*a;
		return b;
	}
	public static void main(String[] args) {
		System.out.println("Main started");
		sq(25);
		System.out.println("Main ended");
	}

}
