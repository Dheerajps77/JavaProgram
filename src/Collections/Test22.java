package Collections;

public class Test22 {
	
	
	public static void main(String[] args) {
		
		
		int n=15;
		
		for(int i=1;i<=n;i++)
		{		
			System.out.println(i);
			if(i%5==0 && i%3==0)
			{
				//System.out.println("Number " + i + " is divisble by 5");
				//System.out.println(i);
				System.out.println("FizzBuzz");				
			}
			else if((i%3==0)&&(!((i%5)==0)))
			{
				//System.out.println(i);
				System.out.println("Fizz");
				//System.out.println("Number " + i + " is divisble by 3");
			}
			else if(!(i%3==0)&&(i%5==0))
			{
				//System.out.println(i);
				System.out.println("Buzz");
				//System.out.println("Number " + i + " is divisble by 3");
			}
			
			else if(!(i%3==0)&&(!(i%5==0)))
			{
				//System.out.println(i);
				//System.out.println("Number " + i + " is divisble by 3");
			}
			
		}
		
	}

	public void Method1() {
		// TODO Auto-generated method stub
		
	}

}
