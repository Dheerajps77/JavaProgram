package com.JavaProgramExample;

public class StringClass {

	public static void main(String[] args) {
		
		/*
		String str = "Hello";
		String str1 = "Hello";
		System.out.println(str.hashCode());
		System.out.println(str);
		System.out.println(str1.hashCode());

		str = "Hello guys";
		System.out.println(str.hashCode());
		System.out.println(str);
		
		 * OutPut : 
		 * 69609650 
		 * Hello 
		 * 69609650 
		 * 388300598 
		 * Hello 
		 * guys
		 */
		
		String string="Hello";
		String string2="Hello";
		
		string2="Hello".toUpperCase();
		System.out.println(string2);
		
		
		
		String string3=new String(string);
		System.out.println("The value before concat : " + string3);
		string3=string3.concat(" guys");
		System.out.println("The value after concat : " + string3);
		/*
		 * 
		 * The value before concat : Hello
		   The value after concat : Hello guys
		 * 
		 */
		

	}

}
