package com.JavaProgramExample;

public class StaticBLocksDemo {
	
	static int c=100;
	static int d=150;
	
	public static void main(String[] args) {
		
		System.out.println(c);
	}
	
	static {
		
		System.out.println(d);
	}

}
