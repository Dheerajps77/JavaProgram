package InterviewQuestionAnswer;

public class StringIndexofAndIntern {

	
	public static void stringComparing()
	{
		try {
			String str="Hello";
			String str1="World";
			String str2=str+str1;
			
			
			String str3=new String("HelloWorld");
			System.out.println(str==str1); //false
			System.out.println(str2==str3); //false			
			System.out.println(str2.equals(str3)); //true
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void stringIntern()
	{
		try {
			String str="Hello";
			String str1="Hello";
			String str3=new String("Hello");
			String str4=new String("Hello");
		
			System.out.println(str==str3); //false
			System.out.println(str1==str4); //false
			
			String str5=str3.intern();
		
			System.out.println(str==str5); //true
			System.out.println(str1==str5); //true
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		stringIntern();
	}
}
