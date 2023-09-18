package tools.ToolsQA;

public class NewClass1 {
	
	public static void highestNumber()
	{
		int n[]= {34,45,85,57,3,13,64,32,31,434,341}, temp=0;
		try {
			
				for(int i=0;i<n.length;i++)
				{
					System.out.println(n[i]);					
					for(int j=i+1;j<n.length;j++)
					{
						System.out.println(n[j]);
						if(n[i]>n[j])
						{
							System.out.println("Before Swap : "+" i value is "+i+" j value is "+ j);
							temp=n[j];							
							n[j]=n[i];
							System.out.println(n[i]);
							System.out.println(n[j]);
							n[i]=temp;
							System.out.println(n[i]);
							System.out.println("=========================");
						}
					}
					System.out.println("Highest value : "+n[i]);
				}
			
		} catch (Exception e) {
		 throw e;
		}
	}
	
	public static void main(String[] args) {
		highestNumber();
	}

}
