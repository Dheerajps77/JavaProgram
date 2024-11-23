package GenericClass;

public class ToMakeGenericSpecific <T>{
	
	T obj;
	ToMakeGenericSpecific(T obj)
	{
		this.obj=obj;
	}
	
	public void reverseString()
	{
		try {			
			String str=(String) obj;
			for(int i=str.length()-1;i>=0;i--)
			{
				System.out.print(str.charAt(i));
			}
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
		
		ToMakeGenericSpecific<String> obj=new ToMakeGenericSpecific<String>("Dheeraj Pratap Singh");
		obj.reverseString();
		
	}

}
