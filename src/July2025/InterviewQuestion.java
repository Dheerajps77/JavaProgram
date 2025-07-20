package July2025;

public class InterviewQuestion {

	public static void findMaximumValue()
	{
		try {
			
			int[] arrNum= {43,667,8,42,2,6,99,7,65,43,33};
			int temp=0;
			for(int i=0;i<arrNum.length-1;i++)
			{
				for(int j=i+1;j<arrNum.length;j++)
				{
					if(arrNum[i]>arrNum[j])
					{
						temp=arrNum[i];
						arrNum[i]=arrNum[j];
						arrNum[j]=temp;
					}
				}
			}
			
			System.out.println("Highest value : " + arrNum[arrNum.length-1]);
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void findMaximumValueUsingDifferentWay()
	{
		try {
			
			int[] arrNum= {43,667,8,42,2,6,99,7,65,43,33, 999,0, -1};
			int max=arrNum[0];
			int min=arrNum[0];
			for(int i=0;i<arrNum.length;i++)
			{
					if(arrNum[i]>max)
					{
						max=arrNum[i];
					}
					
					if(arrNum[i]<min)
					{
						min=arrNum[i];
					}
				
			}
			
			System.out.println("Highest value using different way : " + max); // 999
			System.out.println("Lowest value using different way : " + min); //-1
			
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		findMaximumValueUsingDifferentWay();
	}
}
