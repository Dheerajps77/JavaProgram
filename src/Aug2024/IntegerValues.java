package Aug2024;

public class IntegerValues {
	
	
	/*
	 * Java caches Integer objects within the range of -128 to 127. 
	 * This means that for any Integer object created within this range, 
	 * the JVM returns a reference to an existing object rather than creating a new one. 
	 * This caching is done to save memory and improve performance.
	 */
	public static void main(String[] args) {
		
		Integer num1=200;
		Integer num2=126;
		Integer num3=200;
		Integer num4=126;
		
		if(num1==num3)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("num1 != num2");
		}
		
		if(num2==num4)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("num2 != num4");
		}
	} 

}
