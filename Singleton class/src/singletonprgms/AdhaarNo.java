package singletonprgms;

public class AdhaarNo {
int adhaarNo;
String name;
private AdhaarNo(int adhaarNo,String name){
	this.adhaarNo=adhaarNo;
	this.name=name;
	System.out.println("Adhaar card generated");
}
private static AdhaarNo ac;
public static AdhaarNo getInstance() {
	if(ac==null) {
		ac=new AdhaarNo(123,"Tom");
	}
	return ac;
}
}
