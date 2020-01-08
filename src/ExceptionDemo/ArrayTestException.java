package ExceptionDemo;

public class ArrayTestException {
	
	public static void main(String[] args)
    {
        try
        {
            int a[]= {1, 2, 3, 4};
            for (int i = 1; i <= 4; i++)
            {
                System.out.println ("a[" + i + "]=" + a[i] + "n");
            }
        }
         
        catch (Exception e)
        {
            System.out.println ("error = " + e);
        }
         
        /***
         * Explanation for below code: 
			ArrayIndexOutOfBoundsException has been already caught by base class Exception. 
			When a subclass exception is mentioned after base class exception, then error occurs.
         */
        /*
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println ("ArrayIndexOutOfBoundsException");
        }
        */
    }

}
