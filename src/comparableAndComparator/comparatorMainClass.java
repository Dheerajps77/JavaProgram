package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class roll_number implements Comparator<StudentDetailsComparator> {

	@Override
	public int compare(StudentDetailsComparator o1, StudentDetailsComparator o2) {

		return o1.roll_no - o2.roll_no;
	}

}

class name implements Comparator<StudentDetailsComparator>
{

	@Override
	public int compare(StudentDetailsComparator o1, StudentDetailsComparator o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}

class comparatorMainClass {
	public static void main(String[] args) {
		ArrayList<StudentDetailsComparator> arraylist = new ArrayList<StudentDetailsComparator>();
		StudentDetailsComparator ob1 = new StudentDetailsComparator(10, "Dheeraj Pratap Singh", 28, "New Delhi");
		StudentDetailsComparator ob2 = new StudentDetailsComparator(22, "Rahul Singh", 22, "Hydrabad");
		StudentDetailsComparator ob3 = new StudentDetailsComparator(1, "Neetu Singh", 20, "Uttar Pradesh");
		StudentDetailsComparator ob4 = new StudentDetailsComparator(93, "Anjali Singh", 16, "Harayana");
		StudentDetailsComparator ob5 = new StudentDetailsComparator(35, "Pooja Singh", 23, "Punjab");
		StudentDetailsComparator ob6 = new StudentDetailsComparator(33, "Kanchan Singh", 25, "Orissa");
		StudentDetailsComparator ob7 = new StudentDetailsComparator(90, "Jitender Singh", 31, "Karanataka");
		StudentDetailsComparator ob8 = new StudentDetailsComparator(34, "Sadanand Yadav", 40, "Banglore");
		StudentDetailsComparator ob9 = new StudentDetailsComparator(21, "Mukesh Yadav", 24, "Mumbai");

		arraylist.add(ob1);
		arraylist.add(ob2);
		arraylist.add(ob3);
		arraylist.add(ob4);
		arraylist.add(ob5);
		arraylist.add(ob6);
		arraylist.add(ob7);
		arraylist.add(ob8);
		arraylist.add(ob9);

		System.out.println("Unsorted Order of roll number");
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}

		Collections.sort(arraylist, new roll_number());

		System.out.println("Sorted Order of roll number");
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		
		System.out.println("=======================================================");
		System.out.println("Unsorted order of Name");
		
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
		
		Collections.sort(arraylist, new name());
		
		System.out.println("Sorted order of Name");
		
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
	}
	
/***
* Below are the Output :
Unsorted Order of roll number
StudentDetails [roll_no=10, name=Dheeraj Pratap Singh, age=28, place=New Delhi]
StudentDetails [roll_no=22, name=Rahul Singh, age=22, place=Hydrabad]
StudentDetails [roll_no=1, name=Neetu Singh, age=20, place=Uttar Pradesh]
StudentDetails [roll_no=93, name=Anjali Singh, age=16, place=Harayana]
StudentDetails [roll_no=35, name=Pooja Singh, age=23, place=Punjab]
StudentDetails [roll_no=33, name=Kanchan Singh, age=25, place=Orissa]
StudentDetails [roll_no=90, name=Jitender Singh, age=31, place=Karanataka]
StudentDetails [roll_no=34, name=Sadanand Yadav, age=40, place=Banglore]
StudentDetails [roll_no=21, name=Mukesh Yadav, age=24, place=Mumbai]
Sorted Order of roll number
StudentDetails [roll_no=1, name=Neetu Singh, age=20, place=Uttar Pradesh]
StudentDetails [roll_no=10, name=Dheeraj Pratap Singh, age=28, place=New Delhi]
StudentDetails [roll_no=21, name=Mukesh Yadav, age=24, place=Mumbai]
StudentDetails [roll_no=22, name=Rahul Singh, age=22, place=Hydrabad]
StudentDetails [roll_no=33, name=Kanchan Singh, age=25, place=Orissa]
StudentDetails [roll_no=34, name=Sadanand Yadav, age=40, place=Banglore]
StudentDetails [roll_no=35, name=Pooja Singh, age=23, place=Punjab]
StudentDetails [roll_no=90, name=Jitender Singh, age=31, place=Karanataka]
StudentDetails [roll_no=93, name=Anjali Singh, age=16, place=Harayana]
=======================================================
Unsorted order of Name
StudentDetails [roll_no=1, name=Neetu Singh, age=20, place=Uttar Pradesh]
StudentDetails [roll_no=10, name=Dheeraj Pratap Singh, age=28, place=New Delhi]
StudentDetails [roll_no=21, name=Mukesh Yadav, age=24, place=Mumbai]
StudentDetails [roll_no=22, name=Rahul Singh, age=22, place=Hydrabad]
StudentDetails [roll_no=33, name=Kanchan Singh, age=25, place=Orissa]
StudentDetails [roll_no=34, name=Sadanand Yadav, age=40, place=Banglore]
StudentDetails [roll_no=35, name=Pooja Singh, age=23, place=Punjab]
StudentDetails [roll_no=90, name=Jitender Singh, age=31, place=Karanataka]
StudentDetails [roll_no=93, name=Anjali Singh, age=16, place=Harayana]
Sorted order of Name
StudentDetails [roll_no=93, name=Anjali Singh, age=16, place=Harayana]
StudentDetails [roll_no=10, name=Dheeraj Pratap Singh, age=28, place=New Delhi]
StudentDetails [roll_no=90, name=Jitender Singh, age=31, place=Karanataka]
StudentDetails [roll_no=33, name=Kanchan Singh, age=25, place=Orissa]
StudentDetails [roll_no=21, name=Mukesh Yadav, age=24, place=Mumbai]
StudentDetails [roll_no=1, name=Neetu Singh, age=20, place=Uttar Pradesh]
StudentDetails [roll_no=35, name=Pooja Singh, age=23, place=Punjab]
StudentDetails [roll_no=22, name=Rahul Singh, age=22, place=Hydrabad]
StudentDetails [roll_no=34, name=Sadanand Yadav, age=40, place=Banglore]

*/
}
