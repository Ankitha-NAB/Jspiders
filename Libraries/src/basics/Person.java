package basics;

//program after overriding toString()
public class Person {
	int age;
	Person(int age){
		this.age=age;
	}
	@Override
	public String toString() {
		return "Age is:"+age;
	}
	
	public static void main(String[] args) {
		Person p=new Person(25);
		System.out.println(p);//implicitly calling toString()
		System.out.println(p.toString());//explicitly calling toString()

	}

}
