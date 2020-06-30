package Program30June;

public class ToFindIndexOfElement {
	
	public static void toFindIndexOfArray()
	{
		try {
			int n[] = {3,4,5,9,7,6,4,7, 8};
			int values=n.length;
			double d = 0;
			for(int i=0;i<values;i++)
			{
				if(n.length%2==0)
				{
					int n1=n[values/2];
					int n2=n[values/2-1];
					int sum=n1+n2;
					
					d=((double)(sum))/2;
				}
				else
				{
					d=(double)n[n.length/2];
				}
			}
			System.out.println(d);
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		
		
		toFindIndexOfArray();
	}

}
