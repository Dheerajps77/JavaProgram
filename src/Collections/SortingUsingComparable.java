package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingComparable{
	
	public static void main(String[] args) {
		ArrayList<StudentDetails> arraylist=new ArrayList<StudentDetails>();
		StudentDetails obj=new StudentDetails("Dheeraj Pratap Singh", 3);
		StudentDetails obj1=new StudentDetails("Rahul Pratap Singh", 7);
		StudentDetails obj2=new StudentDetails("Zareen Khan", 5);
		StudentDetails obj3=new StudentDetails("Varun Sharma", 1);
		arraylist.add(obj);
		arraylist.add(obj1);
		arraylist.add(obj2);
		arraylist.add(obj3);
		
		System.out.println("Before Sorting : ");
		System.out.println(arraylist);
		
		Collections.sort(arraylist);
		
		System.out.println("Affter Sorting : ");
		System.out.println(arraylist);	
	}
}
