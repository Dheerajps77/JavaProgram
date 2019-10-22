package SuperKeywordToInvokeConstructorOfParentClass;

/*
When we create the object of sub class, the new keyword invokes the constructor of child class, 
which implicitly invokes the constructor of parent class. 
So the order to execution when we create the object of child class is: parent class constructor is executed first and 
then the child class constructor is executed. 
It happens because compiler itself adds super()(this invokes the no-arg constructor of parent class) 
as the first statement in the constructor of child class.
 */
class ChildClass extends ParentClass {
	public ChildClass() {
		/*
		 * Compile implicitly adds super() here as the first statement of this
		 * constructor.
		 */
		System.out.println("I am in child class constructor...");
	}

	ChildClass(int num){
		/* Even though it is a parameterized constructor.
		 * The compiler still adds the no-arg super() here
		 */
		System.out.println("arg constructor of child class");
	   }
	public void display() {
		System.out.println("I am in child class constructor method ");
	}

	public static void main(String[] args) {

		ChildClass objChildClass = new ChildClass();
		objChildClass.display();
		ChildClass objChildClass1 = new ChildClass(20);

	}
}

/*OUtPut At Below :-*/
/*
I am in parent class constructor...
I am in child class constructor...
I am in child class constructor method 
I am in parent class constructor...
arg constructor of child class
*/