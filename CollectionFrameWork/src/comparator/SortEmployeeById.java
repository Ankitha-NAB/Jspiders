package comparator;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee> {
	@Override
	public int compare(Employee x,Employee y) {
		return x.id-y.id;
	}

}
