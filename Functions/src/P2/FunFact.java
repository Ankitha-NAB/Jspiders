package P2;

public class FunFact {
	//program without parameters and arguments
	static void Factorial() {
		int n=5,fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial: "+fact);
	}

	public static void main(String[] args) {
		Factorial();

	}

}
