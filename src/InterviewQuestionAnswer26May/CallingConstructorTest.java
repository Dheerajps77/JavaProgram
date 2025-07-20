package InterviewQuestionAnswer26May;

public class CallingConstructorTest extends ConstructorTest {

	CallingConstructorTest()
	{
		super("Dheeraj Pratap Singh Singh");
		System.out.println("I am " + name);
	}
	public static void main(String[] args) {
		CallingConstructorTest callingConstructorTest=new CallingConstructorTest();
		callingConstructorTest.main1();
	}
}
