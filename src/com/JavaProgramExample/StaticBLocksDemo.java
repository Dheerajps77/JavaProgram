package com.JavaProgramExample;

//Java program to demonstrate that static  
//block is executed before main(
public class StaticBLocksDemo {

	static int c = 100;
	static int d = 150;

	// static block
	static {
		System.out.println("Inside Static Block.");
	}

	// instance block
	// Below is and it will invoke when the object of class created
	{
		System.out.println("Hello guys");
	}

	public static void main(String[] args) {

		System.out.println(c);
		System.out.println("Inside main method.");
		StaticBLocksDemo objStaticBLocksDemo = new StaticBLocksDemo();
	}

	static {

		System.out.println(d);
	}

	// Below is Output
	/*
	 Inside Static Block. 
	 150 
	 100 
	 Inside main method. 
	 Hello guys
	 * 
	 */

}
