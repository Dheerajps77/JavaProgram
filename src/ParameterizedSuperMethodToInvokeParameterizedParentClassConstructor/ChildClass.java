package ParameterizedSuperMethodToInvokeParameterizedParentClassConstructor;

public class ChildClass extends ParentClass {

	ChildClass() {
		/*
		 * super() must be added to the first statement of constructor otherwise
		 * you will get a compilation error. Another important point to note is
		 * that when we explicitly use super in constructor the compiler doesn't
		 * invoke the parent constructor automatically.
		 */
		super("Hellooo....");
		System.out.println("I am in non-parameterized child Class constructor");
	}

	public void display() {

	}

	public static void main(String[] args) {
		
		ChildClass objChildClass=new ChildClass();
		objChildClass.display();
	}
}

/*OutPut :-*/

/*
I am in parameterized parent Class constructor and value is : Hellooo....
I am in non-parameterized child Class constructor
*/
