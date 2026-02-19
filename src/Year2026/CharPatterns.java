package Year2026;

public class CharPatterns {
	
	
	public static void rightTriangleStarPrintInnerLoop()
	{
		String str="DHEERAJ";
		int length=str.length();
		
		for(int i=0;i<=length-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
/*
D
DH
DHE
DHEE
DHEER
DHEERA
DHEERAJ
 */
		
	}
	
	
	public static void rightTriangleStarPrintOuterLoop()
	{
		String str="DHEERAJ";
		int num=str.length();
		for(int i=0;i<=num-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
/*
D
HH
EEE
EEEE
RRRRR
AAAAAA
JJJJJJJ
 */
		
	}
	
	
	public static void invertedRightAngleTriangle1()
	{
		String str="DHEERAJ";
		int num=str.length();
		
		for(int i=0;i<=num-1;i++)
		{
			for(int j=num-1;j>=i;j--)
			{
			System.out.print(str.charAt(j));	
			}
			System.out.println();
		}
		
/*
JAREEHD
JAREEH
JAREE
JARE
JAR
JA
J
 */
	}
	
	
	public static void invertedRightAngleTriangle2()
	{
		String str="DHEERAJ";
		int num=str.length();
		
		for(int i=0;i<num;i++)
		{
			for(int j=num-1;j>=i;j--)
			{
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
/*
DDDDDDD
HHHHHH
EEEEE
EEEE
RRR
AA
J

 */
	}
	
	public static void invertedRightAngleTriangle3()
	{
		String str="DHEERAJ";
		int num=str.length();
		
		for(int i=0;i<num;i++)
		{
			for(int j=i;j<num;j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
/*
DHEERAJ
HEERAJ
EERAJ
ERAJ
RAJ
AJ
J
 */
	}
	
	public static void invertedRightAngleTriangle4()
	{
		String str="DHEERAJ";
		int num=str.length();
		
		for(int i=num;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
/*
DHEERAJ
DHEERA
DHEER
DHEE
DHE
DH
D
 */
	}
	
	public static void rightAngleTriangleRemoveFromEnd()
	{
		String str="DHEERAJ";
		int num=str.length();
		
		
		for(int i=0;i<=num;i++)
		{
			for(int j=num;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print(str.charAt(k));
			}
			System.out.println();
		}
/*
      D
     DH
    DHE
   DHEE
  DHEER
 DHEERA
DHEERAJ
 */
	}
	
	public static void rightAngleTriangleRemoveFromStart()
	{
		String str="DHEERAJ";
		int num=str.length();
		
		for(int i=0;i<num;i++)
		{
			for(int j=num;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=num-i-1;k<num;k++)
			{
				System.out.print(str.charAt(k));
			}
			System.out.println();
		}
		
/*
       J
      AJ
     RAJ
    ERAJ
   EERAJ
  HEERAJ
 DHEERAJ
 */
	}

	
	public static void invertedLeftAngleTriangle4()
	{
		String str="DHEERAJ";
		int num = str.length();
		
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=num-1;k>=i;k--)
			{
				System.out.print(str.charAt(k));
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
		rightAngleTriangleRemoveFromStart();
	}

}
