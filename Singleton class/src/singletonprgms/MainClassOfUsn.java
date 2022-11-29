package singletonprgms;

public class MainClassOfUsn {
public static void main(String[] args) {
	UniversityNumber nor=UniversityNumber.getInstance();
	System.out.println("usn of the student "+nor.name+" is "+nor.usn);
}
}
