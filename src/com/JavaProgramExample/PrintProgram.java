package com.JavaProgramExample;

public class PrintProgram {
	
	
	public static void RightAngle()
	{
		try {
			int n=10;
			for(int i=1;i<n;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
/*		
OutPut for RightAngle()
*
**
***
****
*****
******
*******
********
*********	

*/	}
	
	public static void PrintStar3()
	{
		try {
			int n=10;
			for(int i=1;i<n;i++)
			{
				for(int j=n-1;j>i;j--)
				{
					System.out.print("*");
				}				
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

/*	
 	OutPut for PrintStar3()
********
*******
******
*****
****
***
**
*	

*/	
	}
	
	
	public static void PrinStar4()
	{
		try {
			
			int n=10;
			
			for(int i=1;i<n;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int k=n;k>i;k--)
				{
					System.out.print("*");
				}				
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		/*		
		 OutPut for PrintStar4()
		 *********
		  ********
		   *******
		    ******
		     *****
		      ****
		       ***
		        **
		         *		
				
		*/
	}
	
	public static void FunnelPattern()
	{
		// Creating diamonds pattern by calling PyramidPattern() method in FunnelPattern()
		PyramidPattern();
		try {
			
			int n=10;
			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(" ");
				}
				
				for(int k=n;k>=i;k--)
				{
					System.out.print("*");
				}
				for(int l=n;l>=i;l--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
/*
output for FunnelPattern()
 ********************
  ******************
   ****************
    **************
     ************
      **********
       ********
        ******
         ****
          **
		
		
 */
	}
	
	public static void PyramidPattern()
	{
		try {
			
			int n=10;
			
			for(int i=1;i<=n;i++)
			{
				for(int j=n;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<i*2;k++)
				{
					System.out.print("*");
				}				
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
/*		
OutPut for PyramidPattern()
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
	
*/	
	}
	
	public static void PrintStar2()
	{
		try {
			int n=10;
			for(int i=1;i<n;i++)
			{
				for(int j=n-1;j>i;j--)
				{
					System.out.print(" ");
				}
				for(int k=0;k<i;k++)
				{
					System.out.print("*");
				}

				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		
		}

/*	
 OutPut for PrintStar2()
        *
       **
      ***
     ****
    *****
   ******
  *******
 ********
*********	
*/	
	}
	public static void main(String[] args) {		
		FunnelPattern();
	}

}
