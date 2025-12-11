package July2025;

public class ClassATest {
	
	String str;
	int age;
	public ClassATest(String str, int age) {
		this.str=str;
		this.age=age;
	}

	public static void main(String[] args) {
		ClassATest aTest=new ClassATest("Dheeraj", 24);
		System.out.println(aTest.age + " : " + aTest.str);
	}
}
