package typecasting;
class India{
	String pm="Mr.Modi";
}
class Karnataka extends India{
	String cm="Mr.Bommai";
}
class TamilNadu extends India{
	String cm="Mr.Naidu";
}
class Goa extends India{
	String cm="Mr.sawant";
}

public class Citizeen {
	//GENERALIZATION
	static void selectState(India obj) {
		if(obj instanceof Karnataka) {
			Karnataka k=(Karnataka)obj;
			System.out.println("state is Karnatka");
			System.out.println("PM: "+k.pm+" "+"CM: "+k.cm);
		}
		else if(obj instanceof TamilNadu){
			TamilNadu t=(TamilNadu)obj;
			System.out.println("state is Tamilnadu");
			System.out.println("PM: "+t.pm+" "+"CM: "+t.cm);
		}
		else if(obj instanceof Goa) {
			Goa g=(Goa)obj;
			System.out.println("state is Goa");
			System.out.println("PM: "+g.pm+" "+"CM: "+g.cm);
		}
	}

	public static void main(String[] args) {
		selectState(new Karnataka());
		selectState(new TamilNadu());
		selectState(new Goa());
		

	}

}
