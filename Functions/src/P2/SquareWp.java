package P2;

public class SquareWp {
	static void sq(int a){
		System.out.println("Square started");
		int b=a*a;
		System.out.println(b);
		System.out.println("Square ended");
	}
	public static void main(String[] args) {
		System.out.println("Main started");
		sq(25);
		System.out.println("Main ended");
	}

}

