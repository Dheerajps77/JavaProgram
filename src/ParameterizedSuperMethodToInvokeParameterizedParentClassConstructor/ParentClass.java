package ParameterizedSuperMethodToInvokeParameterizedParentClassConstructor;

public class ParentClass {
	
	
	ParentClass()
	{
		System.out.println("I am in non-parameterized parent Class constructor");
	}

	ParentClass(String str)
	{
		System.out.println("I am in parameterized parent Class constructor and value is : " + str);
	}
}
