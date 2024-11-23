package Program30June;

public class PatternsOfNumber {
	
	
	public static void pattern()
	{
		int n=10;
		try {
			
			for(int i=1;i<n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				System.out.println();
			}
		} catch (Exception e) {
			throw e;
		}
/***
OutPut: 
1
12
123
1234
12345
123456
1234567
12345678
123456789
*/
	}
	
	public static void pattern1()
	{
		int n=10;
		try {
			
			for(int i=1;i<n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(i);
				}
				System.out.println();
			}
		} catch (Exception e) {
			throw e;
		}
/***
OutPut: 
1
22
333
4444
55555
666666
7777777
88888888
999999999
*/
	}
	
	public static void pattern2()	
	{
		int n=10;
		try {
			
			for(int i=1;i<n;i++)
			{
				for(int j=n-1;j>=i;j--)
				{
					System.out.print(j);
				}
				System.out.println();
			}
		} catch (Exception e) {
			throw e;
		}
/***
OutPut: 
987654321
98765432
9876543
987654
98765
9876
987
98
9
*/
	}
	
	public static void pattern3()	
	{
		int n=10;
		try {
			
			for(int i=1;i<n;i++)
			{
				for(int j=n-1;j>=i;j--)
				{
					System.out.print(i);
				}
				System.out.println();
			}
		} catch (Exception e) {
			throw e;
		}
/***
OutPut: 
111111111
22222222
3333333
444444
55555
6666
777
88
9

*/
	}
	
	public static void pattern4()	
	{
		int n=10;
		try {
			
			for(int i=1;i<n;i++)
			{
				for(int j=i;j<n;j++)
				{
					System.out.print(i);
				}
				System.out.println();
			}
		} catch (Exception e) {
			throw e;
		}
/***
OutPut: 
123456789
23456789
3456789
456789
56789
6789
789
89
9

*/
	}
	public static void main(String[] args) {
		
		//pattern();
		pattern4();
	}

}
