package constructors;

public class Solution2 {

	public static void main(String[] args) {
		Employee e=new Employee(101,"Ankitha",75000.00);
		Student3 s=new Student3(102,"Nikhitha",5);
		System.out.println(e.id+" "+e.name+" "+e.salary);
		System.out.println(s.id+" "+s.name+" "+s.marks);

	}

}
