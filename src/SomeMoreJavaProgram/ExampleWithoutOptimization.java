package SomeMoreJavaProgram;

public class ExampleWithoutOptimization {

	public static void testArrays()
	{
		try {
			int  n[]= {0,45,2,1,677,5,4,33,2,2,44};
			int n1=399;
			for(int i=0;i<n.length;i++)
			{
				for(int j=i+1;j<n.length;j++)
				{
					if(i!=n.length-1)
					{
						if(n[i]+n[j]==n1)
						{
							System.out.println("Number : "+n[j]+ " found at " + j);
						}
					}
					else
					{
						System.out.println("Number : "+n[j]+ " not found at any index");
					}
				}
			}
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		testArrays();
	}

}
