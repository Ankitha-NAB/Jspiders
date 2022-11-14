package patternmatching;

public class Pm14 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==5||i==5||i==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
