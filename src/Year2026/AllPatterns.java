package Year2026;

public class AllPatterns {
	
	
	public static void main(String[] args) {
		diamondPattern();
	}
	
	public static void rightTriangleStar()
	{
		int num=6;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
/*

*
**
***
****
*****		 

*/
	}
	
	public static void leftTriangleStar()
	{
		int num=6;
		for(int i=0;i<num;i++)
		{
			for(int j=num;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
/*
     *
    **
   ***
  ****
 *****

*/
	}
	
	
	public static void invertedTriangleStar()
	{
		int num=6;
		for(int i=0;i<num;i++)
		{
			for(int j=num;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
/*

******
*****
****
***
**
*

*/
	}
	
	public static void invertedTriangleStarAlternateWay()
	{
		int num=6;
		for(int i=num;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
/*

******
*****
****
***
**
*

*/
	}
	
	
	
	
	public static void rightInvertedTriangleStar()
	{
		int num=6;
		
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=num;k>i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
/*
******
 *****
  ****
   ***
    **
     *
 */
	}
	
	public static void pyramidPattern()
	{
		int num=6;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
/*
       
     *
    ***
   *****
  *******
 *********

 */
	}
	
   
	public static void downpyramidPattern()
	{
		int num=6;
		for(int i=num;i>0;i--)
		{
			for(int j=0;j<num-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		***********
		 *********
		  *******
		   *****
		    ***
		     *
		 */
			
	}
	
	public static void diamondPattern() {
		int num = 10;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = num; i > 0; i--) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
/*
           
         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *

 */
}
