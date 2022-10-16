package basics;

//example for equals()
public class Man {
	double height;
	Man(double height){
		this.height=height;
	}
	public boolean equals(Object obj) {
		Man m=(Man)obj;
		return this.height==m.height;
	}
	public static void main(String[] args) {
		Man m1=new Man(5.6);
		Man m2=new Man(5.6);
		System.out.println(m1.equals(m2));
	}
}

