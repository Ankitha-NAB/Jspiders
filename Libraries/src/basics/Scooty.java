package basics;

//after overriding hashCode() 
public class Scooty {
	@Override
	public int hashCode() {
		return 100;
	}
	public static void main(String[] args) {
		Scooty s=new Scooty();
		System.out.println(s.hashCode());
	}
}
