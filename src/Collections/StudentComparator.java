package Collections;

public class StudentComparator {
	
	String name;
	String city;
	int id;	
	
	StudentComparator(String name, String city, int id)
	{
		this.name=name;
		this.city=city;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Student details : [name=" + name + ", city=" + city + ", id=" + id + "]";
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
