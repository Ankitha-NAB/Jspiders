package inheritanceprogramming;

class University{
	String UniversityName="VTU";
	void ConductExams() {
		System.out.println(" VTU is conducting exams");
	}
}

class College extends University{
	String CollegeName="Jspiders";
	void ProvidePlacements() {
		System.out.println(" Jspiders is  providing placements");
	}
}

class Department extends College{
	String DepartName="CSE";
	void AttendingPlacement() {
		System.out.println("CSE department attending all the placements");
	}
}

public class Student {

	public static void main(String[] args) {
		Department dept=new Department();
		System.out.println("University name: "+dept.UniversityName);
		System.out.println("College name: "+dept.CollegeName);
		System.out.println("Department name: "+dept.DepartName);
		System.out.println("---------------");
		dept.ConductExams();
		dept.ProvidePlacements();
		dept.AttendingPlacement();

	}

}