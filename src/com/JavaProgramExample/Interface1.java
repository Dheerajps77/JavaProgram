package com.JavaProgramExample;

public interface Interface1 {
	
	int n=10;
		
	default void Test1()
	{
		System.out.println("Interface test 1");
	}
	
	static void Test2()
	{
		System.out.println("Interface static 2");
	}
	
	void test3();

}

abstract class class2
{
	
	abstract void tes4();
	
	void tes5()
	{
		
	}
	
	public static void main(String[] args) {
		
	}
}
