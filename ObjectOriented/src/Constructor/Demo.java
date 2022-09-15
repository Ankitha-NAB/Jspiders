package Constructor;

public class Demo {
	Demo(int x){
		System.out.println(1);
	}
	Demo(){
		System.out.println(2);
	}

	public static void main(String[] args) {
		System.out.println("start");
		new Demo();
		System.out.println("end");
	}

}
