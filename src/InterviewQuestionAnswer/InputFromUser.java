package InterviewQuestionAnswer;

import java.util.Scanner;

public class InputFromUser {

	// Include Getters and Setters
	// Include five argument constructor
	private String name;
	private int age;
	private String gender;
	private String bloodGroup;
	private long phoneNumber;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gen) {
		this.gender = gen;
	}

	public void setBloodGroup(String bg) {
		this.bloodGroup = bg;
	}

	public void setPhoneNumber(long no) {
		this.phoneNumber = no;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getGender() {
		return this.gender;
	}

	public String getBloodGroup() {
		return this.bloodGroup;
	}

	public long getPhoneNumber() {
		return this.phoneNumber;
	}

	public InputFromUser(String name, int age, String gender, String bloodGroup, long phoneNumber) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Fill the code
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the gender");
		String gender = sc.nextLine();
		System.out.println("Enter the blood group");
		String bloodGroup = sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter the phone no");
		long phoneNumber = sc.nextLong();
	
		
		InputFromUser d = new InputFromUser(name, age, gender, bloodGroup, phoneNumber);
		
	
		
		
		
		System.out.println("Name:" + d.getName());
		System.out.println("Age:" + d.getAge());
		System.out.println("Gender:" + d.getGender());
		System.out.println("Blood group:" + d.getBloodGroup());
		System.out.println("Phone no:" + d.getPhoneNumber());
	}

}
