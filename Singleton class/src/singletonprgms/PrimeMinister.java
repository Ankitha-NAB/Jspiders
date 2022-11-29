package singletonprgms;

public class PrimeMinister {
String name="Modi";
int id=101;
private PrimeMinister() {
	System.out.println("PM elected");
}
private static PrimeMinister pm;
public static PrimeMinister getInstance() {
	if(pm==null) {
		pm=new PrimeMinister();
	}
	return pm;
}
}
