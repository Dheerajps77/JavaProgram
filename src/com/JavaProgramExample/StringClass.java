package com.JavaProgramExample;

public class StringClass {

	String str="Harish";
	public static void main(String[] args) {
		
		StringClass s=new StringClass();
		s.str="Dheeraj";
		
		//System.out.println("s object : "+str);
		StringClass s1=new StringClass();
		s1.str="Mohit";
		//System.out.println("s1 object : "+str);
		StringClass s2=new StringClass();
		s2.str="Priya";
		//System.out.println("s2 object : "+str);
		StringClass s4=new StringClass();
		s4.str="Sohit";
		//System.out.println("s4 object : "+str);
		StringClass s3=new StringClass();
		s3.str="raju";
		System.out.println("s3 object : "+s.str);
		
		/*Output :
		 * raju
		 */
		
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
		
		  String string="Hello"; String string2="Hello";
		  
		  string2="Hello".toUpperCase(); System.out.println(string2);
		  
		 
		  
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
