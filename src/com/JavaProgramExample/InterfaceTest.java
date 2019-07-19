package com.JavaProgramExample;


public class InterfaceTest implements Interface1{

	
	
	public void Test1()
	{
		System.out.println("Class test 1");
	}
	
	
	
	public void Test2()
	{
		System.out.println("Class test 2");
	}
	
	public static void main(String[] args) {
		Interface1 objInterfaceTest=new InterfaceTest();
		objInterfaceTest.Test1();
		Interface1.Test2();
		
	}



	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}
}




