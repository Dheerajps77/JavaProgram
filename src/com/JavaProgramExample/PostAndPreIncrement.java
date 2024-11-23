package com.JavaProgramExample;

public class PostAndPreIncrement {
	
/**
 * Post-decrement : Value is first used for computing the result and then decremented.
 * Pre-decrement : Value is decremented first and then result is computed.
 */
	public static void postIncreamentOp()
	{	
		int a=10;
		int b;
		try {
			
			b=a++;
			System.out.println(b); //10
			System.out.println(a); //11
			System.out.println(b);
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void preIncreamentOp()
	{
		int a=10;
		int b;
		try {
			
			b=++a;
			System.out.println(b); // 11
			System.out.println(a); // 11
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
		postIncreamentOp();
	}

}
