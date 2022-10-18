package exceptionhandling;
import java.util.Scanner;

class AgeInvalidException extends RuntimeException{
	private String message;
	AgeInvalidException(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}

public class MatrimonyPortal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age:");
	int age=sc.nextInt();
	if(age>21) {
		System.out.println("get married,hopefully stay happy:)");
	}
	else {
		try {
			throw new AgeInvalidException("have patience!!!");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
}
