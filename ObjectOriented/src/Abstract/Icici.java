package Abstract;

/* Both abstract class and concrete class can have constructors but abstract
 * class constructors will be invoke by subclass constructor using super() and 
 * IS-A relationship[constructor chaining]
 */
abstract class Rbi{
	Rbi(int amount){
		System.out.println("Depositing "+amount+ " in RBI");
	}
}

public class Icici extends Rbi{
	Icici(){
		super(1000);//explicit super
		System.out.println("In ICICI bank");
	}
	public static void main(String[] args) {
		new Icici();

	}

}
