package SomeMoreJavaProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

	String studName;
	int rollNumber;
	int marks;

	Student(String studName, int rollNumber, int marks) {
		this.studName = studName;
		this.rollNumber = rollNumber;
		this.marks = marks;

		// System.out.println(studName + " " + rollNumber + " " + marks);
	}

	public static void main(String[] args) {

		Student[] studentArray = new Student[10];
		studentArray[0] = new Student("Rahul Singh", 21, 600);
		studentArray[1] = new Student("Dheeraj Pratap Singh", 22, 322);
		studentArray[2] = new Student("Arun Gupta", 23, 467);
		studentArray[3] = new Student("Priynka Rana", 24, 413);
		studentArray[4] = new Student("Akash Kumar", 25, 490);
		studentArray[5] = new Student("Vinod Singh", 26, 123);
		studentArray[6] = new Student("Saurav Kumar", 27, 322);
		studentArray[7] = new Student("Kanchan Singh", 28, 292);
		studentArray[8] = new Student("Pooja  Singh", 29, 132);
		studentArray[9] = new Student("Neetu Singh", 30, 214);

		int sum = 0, highest = 0, rolOfHighestValue = 0, rolOfLowestValue = 0, lowest = 0, temp = 1;
		for (int i = 0; i < studentArray.length; i++) {
			
			// To print high marks
			if (studentArray[i].marks > highest) {
				highest = studentArray[i].marks;
				rolOfHighestValue = studentArray[i].rollNumber;
			}
			
			// To print lowest marks
			if (studentArray.length - 1 > i) {
				if (studentArray[i].marks < studentArray[i + 1].marks) {
					{
						lowest = studentArray[i].marks;
						rolOfLowestValue = studentArray[i].rollNumber;
					}
				}
			}
		}
		System.out.println("Highest number " + highest + " of roll number is  : " + rolOfHighestValue);
		System.out.println("Lowest number " + lowest + " of roll number is  : " + rolOfLowestValue);		
	}
}
