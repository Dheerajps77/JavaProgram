package Feb2024;

public class Pattern {
	
	public static void printPattern1()
	{
		try {
			int n=10;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			throw e;
		}
		
/*

Output below
*
**
***
****
*****
******
*******
********
*********
**********

*/
	}
	
	public static void printPattern()
	{
		try {
			int n=10;
			for(int i=1;i<=n;i++)
			{
				for(int j=n;j>=i;j--)
				{
					System.out.print("*");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(" ");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			throw e;
		}
/*
 * Output
********** 
*********  
********   
*******    
******     
*****      
****       
***        
**         
*
 * 
 */
	}
	
	public static void printPattern2()
	{
		try {
			int n=10;
			for(int i=1;i<=n;i++)
			{
				for(int j=n;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			throw e;
		}
/*
 * Output
 *        *
         **
        ***
       ****
      *****
     ******
    *******
   ********
  *********
 **********
 */
	}
	
	public static void printPirmidPattern()
	{
		try {
			int n=10;
			for(int i=1;i<=n;i++)
			{
				for(int j=n;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			throw e;
		}

/*
 * Output
 *        * 
         * * 
        * * * 
       * * * * 
      * * * * * 
     * * * * * * 
    * * * * * * * 
   * * * * * * * * 
  * * * * * * * * * 
 * * * * * * * * * * 
 */
	}
	
	public static void printCharInPattern()
	{
		String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		try {
			int n=10;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print(alpha.charAt(j) + " ");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			throw e;
		}
/*
 * OutPut
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
A B C D E F G 
A B C D E F G H 
A B C D E F G H I
 * 
 */
	}
	
	public static void printCharInPattern1()
	{
		String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		try {
			int n=10;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print(alpha.charAt(i) + " ");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			throw e;
		}
/*
 * OutPut
B 
C C 
D D D 
E E E E 
F F F F F 
G G G G G G 
H H H H H H H 
I I I I I I I I 
J J J J J J J J J 
 * 
 */
	}
	
	public static void main(String[] args) {
		//printPattern1();
		//printRightAngledTriangleUsingChar();
		printCharInPattern1();
	}

}
