package encapsulations;
class Student{
	private String name;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}

public class TestStudent {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Bunny");
		String name=s.getName();
		System.out.println("Name: "+name);
		System.out.println(s.getName());

	}

}
