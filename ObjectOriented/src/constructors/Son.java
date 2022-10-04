package constructors;

public class Son extends Father{
	Son(){
		//super();---->implicitly(if the super class is non parameterized the sub class constructor will call implicitly)
		System.out.println(2);
	}

	public static void main(String[] args) {
		new Son();

	}

}
