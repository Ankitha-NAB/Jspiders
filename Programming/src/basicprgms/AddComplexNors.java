package basicprgms;

public class AddComplexNors {
	int real,image;
	AddComplexNors(int r,int i){
		this.real=r;
		this.image=i;
	}
	void showC() {
		System.out.println(this.real+"+i"+this.image);
	}
	static AddComplexNors add(AddComplexNors n1,AddComplexNors n2) {
		AddComplexNors res=new AddComplexNors(0,0);
		res.real=n1.real+n2.real;
		res.image=n1.image+n2.image;
		return res;
	}
public static void main(String[] args) {
	AddComplexNors a1=new AddComplexNors(4,5);
	AddComplexNors a2=new AddComplexNors(10,2);
	System.out.println("first complex number:");
	a1.showC();
	System.out.println("second complex number:");
	a2.showC();
	AddComplexNors res=add(a1,a2);
	System.out.println("\nAddition is:");
	res.showC();
	
}
}
