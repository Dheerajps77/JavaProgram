package ExceptionDemo;

public class ArithmeticTestException {
	
	public static void main(String[] args) {
		
		try
        {
            int a = 0;
            System.out.println ("a = " + a);
            int b = 20 / a;
            System.out.println ("b = " + b);
        }
 
        catch(ArithmeticException e)
        {
            System.out.println ("Divide by zero error");
        }
 
        finally
        {
            System.out.println ("inside the finally block");
        }
				
	}
	
	/***
	 * OutPut is :
	    a = 0
		Divide by zero error
		inside the finally block
	 */

}
