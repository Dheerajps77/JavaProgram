package com.JavaProgramExample;

public class StaticString {

	
	static String s1="harish";
	public static void main(String[] args) {
		
		StaticString s2=new StaticString();
		s2.s1="How";
		StaticString s3=new StaticString();		
		s3.s1="When";
		
		System.out.println(StaticString.s1);
	}

}
