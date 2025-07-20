package InterviewQuestionAnswer26May;

public class ConstructorTest {
	
	String name = "Dheeraj pratap Singh";
	ConstructorTest(){
		System.out.println("I am in constructor");
	}
	
	ConstructorTest(String name)
	{
		this.name = name;
	}
	
	public void main1()
	{
		System.out.println("I am method of default constructor");
	}
}