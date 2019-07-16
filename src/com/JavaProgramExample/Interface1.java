package com.JavaProgramExample;

public interface Interface1 {
	
	
	default void Test1()
	{
		System.out.println("Interface test 1");
	}
	
	static void Test2()
	{
		System.out.println("Interface static 2");
	}

}
