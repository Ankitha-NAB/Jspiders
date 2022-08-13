package p;

public class StudentResult1 {

	public static void main(String[] args) {
		char grade='C';
		switch(grade) {
		case 'A':System.out.println("excellent");
		break;
		case 'B':System.out.println("good");
		break;
		case 'C':System.out.println("average");
		break;
		case 'D':System.out.println("poor");
		break;
		default:System.out.println("invalid");
		}

	}

}
