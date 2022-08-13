package p;

public class GreaterNumber {

	public static void main(String[] args) {
		int a=20;
		int b=15;
		int c=10;
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("c is greater");
			}
		}
		else if(b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}

	}

}
