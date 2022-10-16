package exceptionhandling;

public class GetMessageMethod {
public static void main(String[] args) {
	try {
		System.out.println(10/0);//throw new ArithmeticException()
	}
	catch(Exception e) {//Exception e=new ArithmeticException();
		String message=e.getMessage();
		System.out.println(message);
		System.out.println(e.getMessage());
	}
}
}

//this method is used to return a small message about the exception