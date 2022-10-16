package basics;

public class Hotel {
	String name;
	double ratings;
	Hotel(String name,double ratings){
		this.name=name;
		this.ratings=ratings;
	}
	@Override
	public String toString() {
		return "Hotel:"+name+" ratings:"+ratings;
	}
	
	public static void main(String[] args) {
		Hotel h1=new Hotel("Taj",4.8);
		Hotel h2=new Hotel("Mahal",4.6);
		System.out.println(h1);
		System.out.println(h2);
	}
}
