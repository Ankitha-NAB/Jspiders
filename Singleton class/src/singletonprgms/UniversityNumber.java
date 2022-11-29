package singletonprgms;

public class UniversityNumber {
	private static UniversityNumber nor;
	int usn;
	String name;
	private UniversityNumber(int usn,String name) {
		this.usn=usn;
		this.name=name;
	}
	public static UniversityNumber getInstance() {
		if(nor==null) {
			nor=new UniversityNumber(18,"Ankitha");
		}
		return nor;
	}
}
