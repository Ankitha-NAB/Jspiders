package comparator;

import java.util.Comparator;

public class SortStudentByName implements Comparator<Student> {
	@Override
	public int compare(Student x,Student y) {
		return x.name.compareTo(y.name);
	}
	
}
