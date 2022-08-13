package p;

public class StudentResult {

	public static void main(String[] args) {
		int marks=85;
		if(marks>=81 && marks<=100) {
			System.out.println("distinction");
		}
		else if(marks>=35 && marks<=80) {
			System.out.println("first class");
		}
		else if(marks>=0 && marks<=34) {
			System.out.println("fail");
		}
		else {
			System.out.println("invalid marks");
		}

	}

}
