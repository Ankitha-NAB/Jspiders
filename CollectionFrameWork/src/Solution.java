import java.util.ArrayList;

public class Solution {
public static void main(String[] args) {
Student s1=new Student("A",75);
Student s2=new Student("C",45);
Student s3=new Student("B",65);
ArrayList<Student> l=new ArrayList<Student>();
l.add(s1);
l.add(s2);
l.add(s3);
for(Student s:l) {
	System.out.println(s);
}
System.out.println("-----------");
Student max=l.get(0);
Student min=l.get(0);
for(int i=1;i<l.size();i++) {
	if(l.get(i).marks>max.marks) {
		max=l.get(i);
	}
}
System.out.println("Student with highest marks:"+max);
System.out.println("-----------");
for(int i=1;i<l.size();i++) {
	if(l.get(i).marks<min.marks) {
		min=l.get(i);
	}
}
System.out.println("Student with highest marks:"+min);
}
}
