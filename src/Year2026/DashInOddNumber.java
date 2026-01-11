package Year2026;

public class DashInOddNumber {

	public static void convertIntoNumAndThenArray()
	{
		String str="19340271";
		try {			
			
			char[] charArr = str.toCharArray();
			int[] num=new int[charArr.length];
			int temp=0;
			int actNum=0;
			for(int i=0;i<charArr.length;i++)
			{
				
				int numm=actNum+charArr[i] - '0';
				num[temp++]=numm;				
			}
			for(int j=0;j<temp;j++)
			{
				System.out.print(num[j]);
			}
				
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void putDashInOddNumber()
	{
		String str="19340271";
		String result="";
		try {			
			
			char[] charArr = str.toCharArray();
			for(int i=0;i<charArr.length;i++)
			{
				result = result + charArr[i]; // always append current digit
				
				if(i<charArr.length-1) // always append current digit
				{
					int current=charArr[i] - '0';
					int next = charArr[i+1]-'0';
					
					// both numbers are odd
					if(current%2==0 && next%2==0)
					{
						result=result+'-';
					}
				}
			}
			System.out.println(result);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void oddEvenPositionChars()
	{
		try {
			
			String str="HELLO";
			System.out.print("Even positions ==> ");
			for(int i=0;i<str.length();i++)
			{
				if(i%2==0)
				{
					System.out.print(str.charAt(i));
				}
			}
			
			System.out.print("\nOdd positions ==> ");
			for(int i=0;i<str.length();i++)
			{
				if(i%2!=0)
				{
					System.out.print(str.charAt(i));
				}
			}
			
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		putDashInOddNumber();
	}
}
