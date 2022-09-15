package Constructor;

public class Daughter extends Mother {
	Daughter(){
		super("Anku");
		System.out.println("bye");
	}

	public static void main(String[] args) {
		new Daughter();

	}

}
