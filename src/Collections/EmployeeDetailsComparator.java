package Collections;

import java.util.Comparator;

public class EmployeeDetailsComparator implements Comparator<EmployeeDetails>{

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {		
		// TODO Auto-generated method stub
				return o1.employeeName.compareTo(o2.employeeName);
	}

}
