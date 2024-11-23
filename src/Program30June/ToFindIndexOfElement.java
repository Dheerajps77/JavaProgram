package Program30June;

import java.util.Scanner;

public class ToFindIndexOfElement {
	
	public static void toFindIndexOfArray()
	{
		try {
			int n[] = {3,4,5,9,7,6,4};			
			int values=n.length;
			double d = 0;
			for(int i=0;i<values;)
			{
				if(values%2==0)
				{
					int n1=n[values/2];
					int n2=n[values/2-1];
					int sum=n1+n2;
					
					d=((double)(sum))/2;
					break;
				}
				else
				{
					d=(double)n[values/2];
					break;
				}
			}
			System.out.println(d);
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	public static void toGetMiddleIndexByUsingScannerClass()
	{
		try {
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the number you want to show in arrays");
			int n=sc.nextInt();			
			int arrayNumber[]=new int[n];			
			for(int i=0;i<n;i++)
			{
				arrayNumber[i]=sc.nextInt();				
			}
			
		} catch (Exception e) {
			
			
		}
	}
	public static void main(String[] args) {
		
		
		//toFindIndexOfArray();
		toGetMiddleIndexByUsingScannerClass();
	}

}
