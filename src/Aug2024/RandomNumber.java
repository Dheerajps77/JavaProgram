package Aug2024;

import java.util.Random;

public class RandomNumber {
	
	
	 public static int randomNumberUsingRandomClass()
	    {
	    	int number = 0;
	    	Random random;
	    	try {
	    		random=new Random();
	    		number=random.nextInt(100000) + 1;
				
			} catch (Exception e) {
				throw e;
			}
	    	return number;
	    }
	    
	    public static int randomNumberUsingMathFunction()
	    {
	    	int number = 0;
	    	try {
	    		number=((int)(Math.random() * 10000))+1;
				
			} catch (Exception e) {
				throw e;
			}
	    	return number;
	    }
	    
	    public static void generateRandomString()
		{
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder builder=null;
	        Random random;
			try {
				builder=new StringBuilder();
				random=new Random();
				for(int i=0;i<20;i++)
				{
					int length=random.nextInt(characters.length());
					builder.append(characters.charAt(length));
				}
				System.out.println(builder.toString() + "@gmail.com");
			} catch (Exception e) {
				throw e;
			}
		}
	    
	    public static void main(String[] args) {
			
	    	generateRandomString();
	    	System.out.println("Random number using Math Function : "+randomNumberUsingMathFunction());
	    	System.out.println("Random number using Random Class: " + randomNumberUsingRandomClass());
		}

}
