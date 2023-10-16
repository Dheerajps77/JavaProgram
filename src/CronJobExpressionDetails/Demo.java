package CronJobExpressionDetails;

public class Demo {
	
	
	public static void method1()
	{
		try {
			int i=0,j=2;
			
			do{
				i=++i;
				j--;			
			}
			while(j>0);
			System.out.println(i);			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void method2()
	{
		try {
			int[] x={1,2,3,4};
			int[] y=x;
			x=new int[2];
			for(int i=0;i<x.length;i++)
			{
				System.out.print(y[i]+ " ");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void method3()
	{
		try {			
			double[] myList={1,5,45,5,5,1};
			double max=myList[0];
			int indexOfMax=0;
			for(int i=1;i<myList.length;i++)
			{
				if(myList[i]>max)
				{
					max=myList[i];
					indexOfMax=i;
				}
			}
			System.out.println(max);
		} catch (Exception e) {
			throw e;
		}
	}

	
	public static void main(String[] args) {
		
		method3();
		
	}
}
