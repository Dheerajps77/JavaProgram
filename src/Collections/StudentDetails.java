package Collections;

public class StudentDetails implements Comparable<StudentDetails>{
	
	String name;
	int rollNumber;
	StudentDetails(String name, int rollNumber)
	{
		this.name=name;
		this.rollNumber=rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", rollNumber=" + rollNumber;
	}
	@Override
	public int compareTo(StudentDetails o) {
		return this.name.compareTo(o.name);
		//return this.rollNumber-o.rollNumber;
	}

}
