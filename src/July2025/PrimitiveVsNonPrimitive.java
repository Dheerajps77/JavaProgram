package July2025;

public class PrimitiveVsNonPrimitive {

	public static void primitVsNonPrimit() {

		/*
		 * Primitives like int, double, char, etc., are not objects, can't be null.
		 * Non-primitives like String, Integer, etc., are objects, can be null, and used
		 * in collections.
		 */

		// 🌟 Primitive types
		int a = 10;
		double b = 20.5;
		char c = 'X';
		boolean isActive = true;

		System.out.println("Primitive int: " + a);
		System.out.println("Primitive double: " + b);
		System.out.println("Primitive char: " + c);
		System.out.println("Primitive boolean: " + isActive);

		// 🌟 Non-Primitive types (Objects)
		String name = "Dheeraj";
		Integer age = 30; // Wrapper class (Non-primitive)
		Double salary = 55000.75;
		Boolean isEmployee = Boolean.TRUE;

		System.out.println("Non-Primitive String: " + name);
		System.out.println("Wrapper Integer: " + age);
		System.out.println("Wrapper Double: " + salary);
		System.out.println("Wrapper Boolean: " + isEmployee);
	}

	public static void parseXxx() {
		/*
		 * parseInt, parseDouble, etc., are static methods that convert a String to a
		 * primitive.
		 * 
		 * Commonly used in data parsing scenarios like reading config files, user
		 * input, etc.
		 */

		String intStr = "123";
		String doubleStr = "456.78";
		String booleanStr = "true";

		// 🌟 Convert String to primitive types
		int num = Integer.parseInt(intStr); // int
		double price = Double.parseDouble(doubleStr); // double
		boolean flag = Boolean.parseBoolean(booleanStr); // boolean

		System.out.println("Parsed int: " + num);
		System.out.println("Parsed double: " + price);
		System.out.println("Parsed boolean: " + flag);

	}

	public static void valueOf() {

		/*
		 * valueOf() returns an object (Integer, Double, Boolean, String) and supports
		 * null handling, can be used in Collections.
		 */
		String intStr = "123";
		String doubleStr = "456.78";
		String booleanStr = "true";
		int num = 234;

		// 🌟 Convert String to Wrapper Objects (non-primitives)
		Integer numObj = Integer.valueOf(intStr);
		Double priceObj = Double.valueOf(doubleStr);
		Boolean flagObj = Boolean.valueOf(booleanStr);
		String valueofString = String.valueOf(num);

		System.out.println("Integer Object: " + numObj);
		System.out.println("Double Object: " + priceObj);
		System.out.println("Boolean Object: " + flagObj);
		System.out.println("String Object: " + valueofString);
	}

	public static void autoBoxingUnboxing() {
		/*
		 * Autoboxing: Java converts primitive → object (int → Integer)
		 * Unboxing: Java converts object → primitive (Integer → int)
		 */
		
		// 🌟 Autoboxing: primitive → wrapper object
		int num = 100;
		Integer numObj = num; // Java automatically wraps this (autoboxing)

		// 🌟 Unboxing: wrapper object → primitive
		Double salaryObj = 10000.50;
		double salary = salaryObj; // Java automatically unwraps (unboxing)

		System.out.println("Autoboxed Integer object: " + numObj);
		System.out.println("Unboxed double value: " + salary);
	}

	public static void main(String[] args) {

	}
}
