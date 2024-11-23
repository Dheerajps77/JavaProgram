package Program30June;

public class ToFindIndexOfParticularElement {
	
	
	public static void toGetIndexOfParticularElement()
	{
		try {
			
			int n[] ={34,56,2,46,21,8,9};
			int value=21;
			int temp=0;
			for(int i=0;i<n.length;i++)
			{
				if(n[i]==value)
				{
					temp=i;	
				}
			}
			
			System.out.println("The index value is : " + temp + " of number " + value);
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		
		toGetIndexOfParticularElement();
		
		
		
	}

}
