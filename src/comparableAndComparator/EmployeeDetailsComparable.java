package comparableAndComparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDetailsComparable implements Comparable<EmployeeDetailsComparable> {
	
	int emp_Id;
	String emp_Name;
	int salary;
	String emp_Department;
	
	EmployeeDetailsComparable(int emp_Id, String emp_Name,int salary,String emp_Department)
	{
		this.emp_Id=emp_Id;
		this.emp_Name=emp_Name;
		this.salary=salary;
		this.emp_Department=emp_Department;
	}

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmp_Department() {
		return emp_Department;
	}

	public void setEmp_Department(String emp_Department) {
		this.emp_Department = emp_Department;
	}

	@Override
	public String toString() {
		return "EmployeeDetailsComparable [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", salary=" + salary
				+ ", emp_Department=" + emp_Department + "]";
	}

	@Override
	public int compareTo(EmployeeDetailsComparable o) {		
		return this.emp_Id-o.emp_Id;
	}
	
	public static void main(String[] args) {
		ArrayList<EmployeeDetailsComparable> arraylist=new ArrayList<EmployeeDetailsComparable>();
		EmployeeDetailsComparable obj=new EmployeeDetailsComparable(20, "Dheeraj Pratap Singh", 20000, "IT Sector");
		EmployeeDetailsComparable obj1=new EmployeeDetailsComparable(24, "Rahul Singh", 23222, "Networking Sector");
		EmployeeDetailsComparable obj2=new EmployeeDetailsComparable(45, "Neetu Singh", 23421, "Govt. Sector");
		EmployeeDetailsComparable obj3=new EmployeeDetailsComparable(32, "Kanchan Singh", 89903, "Private Sector");
		EmployeeDetailsComparable obj4=new EmployeeDetailsComparable(33, "Pooja Singh", 27928, "Sales Sector");
		EmployeeDetailsComparable obj5=new EmployeeDetailsComparable(22, "Mukesh Yadav", 28378, "Purchase Sector");
		arraylist.add(obj);
		arraylist.add(obj1);
		arraylist.add(obj2);
		arraylist.add(obj3);
		arraylist.add(obj4);
		arraylist.add(obj5);
		
		System.out.println("Unsorted Order : ");
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
		
		Collections.sort(arraylist);
		System.out.println("Sorted Order : ");
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
		
	}
	
/***
 Below are the Output :
Unsorted Order : 
EmployeeDetailsComparable [emp_Id=20, emp_Name=Dheeraj Pratap Singh, salary=20000, emp_Department=IT Sector]
EmployeeDetailsComparable [emp_Id=24, emp_Name=Rahul Singh, salary=23222, emp_Department=Networking Sector]
EmployeeDetailsComparable [emp_Id=45, emp_Name=Neetu Singh, salary=23421, emp_Department=Govt. Sector]
EmployeeDetailsComparable [emp_Id=32, emp_Name=Kanchan Singh, salary=89903, emp_Department=Private Sector]
EmployeeDetailsComparable [emp_Id=33, emp_Name=Pooja Singh, salary=27928, emp_Department=Sales Sector]
EmployeeDetailsComparable [emp_Id=22, emp_Name=Mukesh Yadav, salary=28378, emp_Department=Purchase Sector]
Sorted Order : 
EmployeeDetailsComparable [emp_Id=20, emp_Name=Dheeraj Pratap Singh, salary=20000, emp_Department=IT Sector]
EmployeeDetailsComparable [emp_Id=22, emp_Name=Mukesh Yadav, salary=28378, emp_Department=Purchase Sector]
EmployeeDetailsComparable [emp_Id=24, emp_Name=Rahul Singh, salary=23222, emp_Department=Networking Sector]
EmployeeDetailsComparable [emp_Id=32, emp_Name=Kanchan Singh, salary=89903, emp_Department=Private Sector]
EmployeeDetailsComparable [emp_Id=33, emp_Name=Pooja Singh, salary=27928, emp_Department=Sales Sector]
EmployeeDetailsComparable [emp_Id=45, emp_Name=Neetu Singh, salary=23421, emp_Department=Govt. Sector]
*/
}
