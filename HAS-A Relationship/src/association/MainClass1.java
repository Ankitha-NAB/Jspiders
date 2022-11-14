package association;


class Country{
	String name="India";
	State state=new State();
}
class State{
	String name="Karnataka";
	District district=new District();
}
class District{
	String name="Davangere";
}
public class MainClass1 {
public static void main(String[] args) {
	Country country=new Country();
	System.out.println(country);
	System.out.println("Country name:"+country.name);
	System.out.println(country.state);
	System.out.println("State name:"+country.state.name);
	System.out.println(country.state.district);
	System.out.println("District name:"+country.state.district.name);
}
}
