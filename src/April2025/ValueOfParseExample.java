package April2025;

public class ValueOfParseExample {
	
	
	/*
	Notes
	parseXxx() returns primitive
	valueOf() returns Wrapper Object
	parseXxx() throws NumberFormatException if input is invalid
	Boolean.parseBoolean("true") returns true (case insensitive), anything else is false
	*/

	public static void main(String[] args) {
		// Example using Integer.valueOf()
		String intString = "123";
		Integer integerValue = Integer.valueOf(intString);
		System.out.println("Integer value (valueOf): " + integerValue); // Integer object //

		// Example using Integer.parseInt()
		int parsedIntValue = Integer.parseInt(intString);
		System.out.println("Parsed integer value (parse): " + parsedIntValue); // Primitive int

		// Example using Double.valueOf()
		String doubleString = "45.67";
		Double doubleValue = Double.valueOf(doubleString);
		System.out.println("Double value (valueOf): " + doubleValue); // Double object

		// Example using Double.parseDouble()
		double parsedDoubleValue = Double.parseDouble(doubleString);
		System.out.println("Parsed double value (parse): " + parsedDoubleValue); // Primitive double

		// Example using Boolean.valueOf()
		String booleanString = "true";
		Boolean booleanValue = Boolean.valueOf(booleanString);
		System.out.println("Boolean value (valueOf): " + booleanValue); // Boolean object

		// Example using Boolean.parseBoolean()
		boolean parsedBooleanValue = Boolean.parseBoolean(booleanString);
		System.out.println("Parsed boolean value (parse): " + parsedBooleanValue); // Primitive boolean
		
		/* OutPut Below :
		Integer value (valueOf): 123
		Parsed integer value (parse): 123
		Double value (valueOf): 45.67
		Parsed double value (parse): 45.67
		Boolean value (valueOf): true
		Parsed boolean value (parse): true
		
		*/
	}
}
