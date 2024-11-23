package InterviewQuestionAnswer;

public class CubeOfEachNumbersInArray {
	
	public static void cubeOfNumbersInArray()
	{
		try {
			
			int n[]= {5,4,3,3,5,6,7,8,9};
			
			int array[]=new int[n.length];
			for(int i=0;i<n.length;i++)
			{
				array[i]=n[i] * n[i]* n[i];
			}
			
			for(int j=0;j<array.length;j++)
			{
				System.out.print(array[j] + " ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void addWithAnySpecificNumberInArray()
	{
		try {
			
			int n[]= {5,4,3,2,5,6,7,8,9};
			int num=5;
			for(int i=0;i<n.length;i++)
			{
				if(n[i] == num)
				{
					n[i]=n[i]+60;
				}
			}
			
			for(int j=0;j<n.length;j++)
			{
				System.out.print(n[j] + " ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		addWithAnySpecificNumberInArray();
	}

}
