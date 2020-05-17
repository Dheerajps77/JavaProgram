package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentDetailsComparator {
	int roll_no;
	String name;
	int age;
	String place;
	StudentDetailsComparator(int roll_no, String name,int age,String place)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.age=age;
		this.place=place;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "StudentDetails [roll_no=" + roll_no + ", name=" + name + ", age=" + age + ", place=" + place + "]";
	}
}
