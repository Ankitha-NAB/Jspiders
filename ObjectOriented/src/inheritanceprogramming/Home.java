package inheritanceprogramming;
class cleaningItems{
	String thing="Colin";
	void clean() {
		System.out.println("through colin we can clean the home ");
	}
}
class eatingItems extends cleaningItems{
	String item="Fruits";
	void eat() {
		System.out.println("in home we can eat fruits");
	}
}
class readingBooks extends eatingItems{
	void read() {
		System.out.println("we can read books without any distraction");
	}
}

public class Home {

	public static void main(String[] args) {
		readingBooks r=new readingBooks();
		r.read();
		r.eat();
		r.clean();

	}

}
