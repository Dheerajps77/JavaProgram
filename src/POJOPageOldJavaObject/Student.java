package POJOPageOldJavaObject;

// The given example is a clear-cut example of the POJO class. 
public class Student {

	String name;
	public String id;
	private double fees;
	
	Student(String name, String id, double fees)
	{
		this.name=name;
		this.id=id;
		this.fees=fees;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
}
