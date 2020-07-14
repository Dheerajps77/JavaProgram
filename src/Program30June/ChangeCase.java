package Program30June;

public class ChangeCase {
	
	public static void toLowerCase(String str)
	{
		try {
			
			char []c=str.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				if(c[i]>64&& c[i]<91)
				{
					int n=c[i];
					c[i]=(char) (n+32);
				}
				System.out.print(c[i]);
			}
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void toUparCase(String str)
	{
		System.out.println();
		try {
			
			char []c=str.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				if(c[i]>97&& c[i]<123)
				{
					int n=c[i];
					c[i]=(char) (n-32);
				}
				System.out.print(c[i]);
			}
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
		
		String str="DHeeRAJ";
		toLowerCase(str);
		toUparCase(str);
	}

}
