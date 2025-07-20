package InterviewQuestionAnswer26May;

public class PrimitiveAndNonPrimitive {

	public static void main(String[] args) {
		
		
/*
  1. valueOf() Method
	Belongs to: Wrapper classes like Integer, Double, Boolean, etc.
	Returns: Wrapper object (not primitive).
	Overloaded: Yes — accepts different argument types like String, int, char[], etc.
	Converts a String (or primitive) to a Wrapper Object.
 */
		Integer.valueOf("123");     // returns Integer object
		Boolean.valueOf("true");    // returns Boolean object
		Double.valueOf("12.34");    // returns Double object
		
/*
 2. parseXxx() Method
	Belongs to: Wrapper classes like Integer, Double, Boolean, etc.
	Returns: Primitive type (like int, double, boolean).
	Used for: Converting String to primitive values.
	Converts a String to a primitive value.
	Faster and more lightweight than valueOf()
 */
		
		int num = Integer.parseInt("123");         // returns int
		boolean flag = Boolean.parseBoolean("true");  // returns boolean
		double d = Double.parseDouble("45.67");    // returns double
	}
}
