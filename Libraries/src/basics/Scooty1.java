package basics;

//without overriding will get unique id or number of an object
public class Scooty1 {
public static void main(String[] args) {
	Scooty1 s=new Scooty1();
	System.out.println(s.hashCode());
}
}
