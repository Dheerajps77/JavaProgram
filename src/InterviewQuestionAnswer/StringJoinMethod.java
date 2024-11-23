package InterviewQuestionAnswer;

import java.util.StringJoiner;

public class StringJoinMethod {
	
	
	public static void stringJoinerExample()
	{
		try {
			
			StringJoiner joiner=new StringJoiner(","); // QA,Books,No
			joiner.add("QA");
			joiner.add("Books");
			joiner.add("No");
			
			System.out.println(joiner.toString());
			
			StringJoiner joiner1=new StringJoiner(",", "[", "]");
			joiner1.add("QA");
			joiner1.add("Books");
			joiner1.add("No");
			
			System.out.println(joiner1.toString()); // [QA,Books,No]
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void stringJoinExample()
	{
		try {
			
			String[] fruits = {"Apple", "Banana", "Cherry"};

	        // Using String.join() to concatenate the array elements with a delimiter
	        String result = String.join(", ", fruits);

	        System.out.println(result); // Output: Apple, Banana, Cherry
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	public static void main(String[] args) {
		stringJoinExample();
	}

}
