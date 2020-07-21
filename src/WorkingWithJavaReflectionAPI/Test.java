package WorkingWithJavaReflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class SuperClass
{
	
}
public class Test extends SuperClass{
	
	String str;
	private final int n1=10;
	Test(String str)
	{
		this.str=str;		
	}	
	 // Creating a public method with no arguments 
    public void method1()  { 
        System.out.println("The string is " + str); 
        System.out.println(n1);
    } 
  
    // Creating a public method with int as argument 
    public void method2(int n)  { 
        System.out.println("The number is " + n); 
    } 
  
    // creating a private method 
    private void method3() { 
        System.out.println("Private method invoked"); 
    } 
    
    public static void main(String[] args) {
		
    	Test test=new Test("Dheeraj Pratap Singh");
    	test.method1();
    	test.method2(24);
    	test.method3();
    	
    	Class c=test.getClass();
    	System.out.println("class name is : "+c.getSimpleName());
    	
    	System.out.println(c.getModifiers()); // 1
    	System.out.println(c.getSuperclass().getSimpleName()); // SuperClass
    	Constructor [] constructor=c.getConstructors();
    	
    	for(int i=0;i<=constructor.length-1;i++)
    	{
    		System.out.println(constructor[i]);
    	}
    	
    	Method[] method=c.getMethods();
    	
    	for(int i=0;i<=method.length-1;i++)
    	{
    		System.out.println(method[i].getName());
/***
OutPut
method1
method2
main
wait
wait
wait
equals
toString
hashCode
getClass
notify
notifyAll
*/
    	}
    	
    	Method[] declaredMethod=c.getDeclaredMethods();
    	for(int i=0;i<=declaredMethod.length-1;i++)
    	{
    		System.out.println(declaredMethod[i].getName());
 /***
Output :
main
method2
method1
method3
  */    		
    	}
	}
}
