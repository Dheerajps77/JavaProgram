package Collections;

import java.util.ArrayList;
import java.util.Collections;


public class SortingUsingComparator {
	
	public static void main(String[] args) {
		ArrayList<EmployeeDetails> arraylist=new ArrayList<EmployeeDetails>();
		EmployeeDetails obj=new EmployeeDetails("Shikhar Dhawan", 4521);
		EmployeeDetails obj1=new EmployeeDetails("Zoya Khan", 4321);
		EmployeeDetails obj2=new EmployeeDetails("Varun Dhawan", 6786);
		EmployeeDetails obj3=new EmployeeDetails("Arjun Singh", 1111);
		EmployeeDetails obj4=new EmployeeDetails("Yogesh Singh", 9887);
		arraylist.add(obj);
		arraylist.add(obj1);
		arraylist.add(obj2);
		arraylist.add(obj3);
		arraylist.add(obj4);
		System.out.println("Before sorting : ");
		System.out.println(arraylist);
		Collections.sort(arraylist, new EmployeeDetailsComparator());
		System.out.println("After sorting : ");
		System.out.println(arraylist);
	}

}
