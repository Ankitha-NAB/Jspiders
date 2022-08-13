package P2;

public class SquareWr {
	static int sq(){
		int a=25;
		System.out.println("Square started");
		int b=a*a;
		return b;
	}
	public static void main(String[] args) {
		System.out.println("Main started");
		System.out.println(sq());
		System.out.println("Main ended");
	}

}
