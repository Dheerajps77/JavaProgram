package com.JavaProgramExample;

//Interface fields are public, static and final by default, and the methods are public and abstract.
interface A
{
	int n=10;// bydefault the declared field or declared member variables is PUBLIC STATIC, FINAL 
	int n2=20;
	
	//Since Java 8, interface can have default and static methods
	static void method1()// We can create default and static since Java 9 method in interface
	{
		System.out.println(n);
	}
	
	default void method2()// We can create default and static since Java 9 method in interface
	{
		System.out.println(n2);
	}
	
	public void method3();
	void method4(); // bydefault the unimplemented method is abstract in interface
}

interface C
{
	int n=10;
	int n2=20;
	
	
	static void method5()
	{
		System.out.println(n);
	}
	
	default void method6()
	{
		System.out.println(n2);
	}
	
	public void method7();
	void method8();
}

abstract class B implements A, C
{
	int n1;
}
public class InterfaceDemo extends B {

	
	@Override
	public void method3() {
		A.method1();
		C.method5();
		System.out.println("method3");
	}

	@Override
	public void method4() {
		
		System.out.println("method4");
	}

	@Override
	public void method7() {
		
		System.out.println("method7");
	}

	@Override
	public void method8() {
		
		System.out.println("method8");
	}
	
	public static void main(String[] args) {
		
		InterfaceDemo objInterfaceDemo=new InterfaceDemo();		
		objInterfaceDemo.method2();
		objInterfaceDemo.method3();
		objInterfaceDemo.method4();
		objInterfaceDemo.method6();
		objInterfaceDemo.method7();
		objInterfaceDemo.method8();		
	}

}
