package SomeMoreJavaProgram;

public class ConstructorObjectInArrays {

	String studName;
	int rollNumber;
	int marks;

	ConstructorObjectInArrays(String studName, int rollNumber, int marks) {
		this.studName = studName;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}

	public static void main(String[] args) {

		ConstructorObjectInArrays[] studentArray = new ConstructorObjectInArrays[10];
		studentArray[0] = new ConstructorObjectInArrays("Rahul Singh", 21, 600);
		studentArray[1] = new ConstructorObjectInArrays("Dheeraj Pratap Singh", 22, 322);
		studentArray[2] = new ConstructorObjectInArrays("Arun Gupta", 23, 467);
		studentArray[3] = new ConstructorObjectInArrays("Priynka Rana", 24, 413);
		studentArray[4] = new ConstructorObjectInArrays("Akash Kumar", 25, 490);
		studentArray[5] = new ConstructorObjectInArrays("Vinod Singh", 26, 123);
		studentArray[6] = new ConstructorObjectInArrays("Saurav Kumar", 27, 322);
		studentArray[7] = new ConstructorObjectInArrays("Kanchan Singh", 28, 292);
		studentArray[8] = new ConstructorObjectInArrays("Pooja  Singh", 29, 132);
		studentArray[9] = new ConstructorObjectInArrays("Neetu Singh", 30, 214);

		int sum = 0, highest = 0, rolOfHighestValue = 0, rolOfLowestValue = 0, lowest = 0, temp = 1;
		for (int i = 0; i < studentArray.length; i++) {
			
			// To print high marks
			if (studentArray[i].marks > highest) {
				highest = studentArray[i].marks;
				rolOfHighestValue = studentArray[i].rollNumber;
			}
			
			int low=studentArray[0].marks;
			if(studentArray[i].marks<low)
			{
				lowest=studentArray[i].marks;
				rolOfLowestValue = studentArray[i].rollNumber;
			}
			
		}
		System.out.println("Highest number " + highest + " of roll number is  : " + rolOfHighestValue);
		System.out.println("Lowest number " + lowest + " of roll number is  : " + rolOfLowestValue);		
	}
}
