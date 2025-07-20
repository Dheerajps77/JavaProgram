package July2025;

import java.util.*;

public class PrimitiveAndWrapperExamples {

    public static void main(String[] args) {

        // ✅ 1. Primitive vs Non-Primitive
        System.out.println("----- Primitive vs Non-Primitive -----");

        // Primitive types: basic built-in data types
        int a = 10;                // primitive int
        double b = 20.5;           // primitive double
        char c = 'X';              // primitive char
        boolean isActive = true;   // primitive boolean

        // Non-primitive types (Objects or reference types)
        String name = "Dheeraj";           // String is a class in java.lang
        Integer age = 30;                  // Wrapper class for int
        Double salary = 55000.75;          // Wrapper class for double
        Boolean isEmployee = Boolean.TRUE; // Wrapper class for boolean

        System.out.println("Primitive int: " + a);
        System.out.println("Primitive double: " + b);
        System.out.println("Primitive char: " + c);
        System.out.println("Primitive boolean: " + isActive);
        System.out.println("Non-Primitive String: " + name);
        System.out.println("Wrapper Integer: " + age);
        System.out.println("Wrapper Double: " + salary);
        System.out.println("Wrapper Boolean: " + isEmployee);

        // ✅ 2. parseXxx() examples – convert String to primitive
        System.out.println("\n----- parseXxx() Examples -----");

        String intStr = "123";
        String doubleStr = "456.78";
        String booleanStr = "true";
        String floatStr = "99.99";
        String longStr = "123456789";

        // These methods return primitives (int, double, boolean, float, long)
        int parsedInt = Integer.parseInt(intStr);
        double parsedDouble = Double.parseDouble(doubleStr);
        boolean parsedBoolean = Boolean.parseBoolean(booleanStr);
        float parsedFloat = Float.parseFloat(floatStr);
        long parsedLong = Long.parseLong(longStr);

        System.out.println("Parsed int: " + parsedInt);
        System.out.println("Parsed double: " + parsedDouble);
        System.out.println("Parsed boolean: " + parsedBoolean);
        System.out.println("Parsed float: " + parsedFloat);
        System.out.println("Parsed long: " + parsedLong);

        // ✅ 3. valueOf() examples – convert String to Wrapper Objects
        System.out.println("\n----- valueOf() Examples -----");

        // These methods return Wrapper Objects (Integer, Double, Boolean, etc.)
        Integer valueInt = Integer.valueOf(intStr);
        Double valueDouble = Double.valueOf(doubleStr);
        Boolean valueBoolean = Boolean.valueOf(booleanStr);
        Float valueFloat = Float.valueOf(floatStr);
        Long valueLong = Long.valueOf(longStr);
        Character valueChar = Character.valueOf('Z'); // char → Character

        System.out.println("Integer Object: " + valueInt);
        System.out.println("Double Object: " + valueDouble);
        System.out.println("Boolean Object: " + valueBoolean);
        System.out.println("Float Object: " + valueFloat);
        System.out.println("Long Object: " + valueLong);
        System.out.println("Character Object: " + valueChar);

        // ✅ 4. Autoboxing & Unboxing
        System.out.println("\n----- Autoboxing and Unboxing -----");

        // Autoboxing: automatic conversion from primitive to object
        int num = 100;
        Integer boxedNum = num; // Java internally uses Integer.valueOf(num)

        // Unboxing: automatic conversion from object to primitive
        Double boxedSalary = 10000.50;
        double unboxedSalary = boxedSalary; // Java internally uses boxedSalary.doubleValue()

        System.out.println("Autoboxed Integer: " + boxedNum);
        System.out.println("Unboxed Double: " + unboxedSalary);

        // ✅ 5. Real-World Example of parse and valueOf usage
        System.out.println("\n----- Real-World Example -----");

        String userInputAge = "25";          // Simulating user input as String
        String userInputStatus = "true";

        // Use parse when you need primitives for calculations
        int userAge = Integer.parseInt(userInputAge); // primitive

        // Use valueOf when you need object (e.g., for collections or null support)
        Boolean statusObj = Boolean.valueOf(userInputStatus); // object

        // Store in a map (value must be objects, hence wrapper types)
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("Age", userAge);         // Autoboxing happens here
        userMap.put("Status", statusObj);    // Already an object

        System.out.println("User Map: " + userMap);

        // ✅ 6. Null-Safety Example
        System.out.println("\n----- Null Safety -----");

        String maybeNull = null;

        // Safe conversion with null check
        Integer safeInt = (maybeNull != null) ? Integer.valueOf(maybeNull) : null;

        System.out.println("Null-safe Integer: " + safeInt); // Output: null

        // ❌ This would throw NullPointerException if uncommented:
        // int unsafeInt = Integer.parseInt(maybeNull);
    }
}

