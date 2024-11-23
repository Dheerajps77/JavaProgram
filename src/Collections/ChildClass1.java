package Collections;

class ChildClass1 extends MethodOverriding
{
	public void MethodName() {
		System.out.println("Child Class");
		
		
	}
	
	public String MethodName1()
	{
		String string=null;
		int n=10;
		return string;
	}
	
	public static void main(String[] args) {
		
		// If a Parent type reference refers 
        // to a Parent object, then Parent's 
        // show is called 
		MethodOverriding objChildClass=new MethodOverriding();
		
		// If a Parent type reference refers 
        // to a Child object Child's show() 
        // is called. This is called RUN TIME 
        // POLYMORPHISM.
		MethodOverriding pbjMethodOverriding=new ChildClass1();
		objChildClass.MethodName();
		pbjMethodOverriding.MethodName();
	}
}