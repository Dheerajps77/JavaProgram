package March2025;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
Q1)  Why Override hashCode() and equals()?
1. The hashCode() method helps in bucket placement inside the HashMap. If two objects have the same hash code, 
	they are placed in the same bucket.
2. The equals() method is used to compare keys. If two objects are equal, they should return true, 
	even if they are different instances.
 */
public class Employee {

	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

    // Overriding hashCode() to generate unique hash values
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

    // Overriding equals() to compare objects based on values
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	public static void main(String[] args) {
		
/*
Override hashCode() and equals() to ensure uniqueness						
What Happens if You Don’t Override hashCode() and equals()?
If hashCode() and equals() are not overridden, every new object is treated as a different key. So:			
System.out.println(employeeMap.get(new Employee(1, "Dheeraj"))); // Output: null
*/
		
		Employee employee=new Employee(24, "Dheeraj Pratap Singh");
		Employee employee1=new Employee(2434, "Rahul Pratap Singh");
		
		HashMap<Employee, String> maps=new HashMap<Employee, String>();
		
		maps.put(employee, "Manager");
		maps.put(employee1, "Developer");
		
		// Fetching value using a new Employee object with the same details
        System.out.println(maps.get(new Employee(24, "Dheeraj Pratap Singh"))); // Output: Manager
        
        for(Map.Entry<Employee, String> values :  maps.entrySet())
        {
        	System.out.println(values.getKey().name + " : " + values.getValue());
        	//out Below
        	/*
        	 
        	 Rahul Pratap Singh : Developer
			 Dheeraj Pratap Singh : Manager
        	 
        	 */
        }
        
        for(Map.Entry<Employee, String> values :  maps.entrySet())
        {
        	System.out.println(values.getKey().id + " : " + values.getValue());
        	//out Below
        	/*
        	 
        	 2434 : Developer
			 24 : Manager
        	 
        	 */
        }
        
        for(Map.Entry<Employee, String> values :  maps.entrySet())
        {
        	System.out.println(values.getKey() + " : " + values.getValue());
        	//out Below
        	/*
        	 
        	Employee [id=2434, name=Rahul Pratap Singh] : Developer
			Employee [id=24, name=Dheeraj Pratap Singh] : Manager
        	 
        	 */
        }
	}
}
