package association;


class Countryy{
	String name;
	Statee state;
	Countryy(String name,Statee state){
		this.name=name;
		this.state=state;
	}
}
class Statee{
	String name;
	Districtt district;
	Statee(String name,Districtt district){
		this.name=name;
		this.district=district;
	}
}
class Districtt{
	String name;
	Districtt(String name){
		this.name=name;
	}
}
public class MainClass2 {
public static void main(String[] args) {
	Districtt district=new Districtt("Bangalore");
	Statee state=new Statee("Karnataka",district);
	Countryy country=new Countryy("India",state);
	System.out.println(country.name);
	System.out.println(country.state.name);
	System.out.println(country.state.district.name);
}
}
