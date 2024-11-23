package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentComparator1  {
	
	
	public static void main(String[] args) {
		
		ArrayList<StudentComparator> arraylist=new ArrayList<StudentComparator>();
		StudentComparator obj=new StudentComparator("Dheeraj", "India", 23);
		StudentComparator obj1=new StudentComparator("John", "Australia", 24);
		StudentComparator obj2=new StudentComparator("Abrahm Lincoln", "UK", 25);
		StudentComparator obj3=new StudentComparator("Sandy", "US", 26);
		StudentComparator obj4=new StudentComparator("Jessica", "Canada", 27);
		StudentComparator obj5=new StudentComparator("Rolly", "Switzerland", 28);
		arraylist.add(obj1);
		arraylist.add(obj2);
		arraylist.add(obj3);
		arraylist.add(obj4);
		arraylist.add(obj5);
		System.out.println("Before Sorting ....");
		System.out.println(arraylist);
		
		Comparator<StudentComparator> comp=new Comparator<StudentComparator>() {		
			@Override
			public int compare(StudentComparator o1, StudentComparator o2) {				
				return o1.name.compareTo(o2.name);
			}
		};
		
		Collections.sort(arraylist, comp);
		System.out.println("After Sorting ....");
		System.out.println(arraylist);
	}

}
