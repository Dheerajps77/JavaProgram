package Program30June;

import java.util.Scanner;

public class ConvertIntToString {
	
	public static void convertIntToString()
	{
		try {
			System.out.println("Enter number to convert into String");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			String str1=String.valueOf(n);
			System.out.println("Converted number into string are"+str1);
			
			String str=Integer.toString(n);
			System.out.println(str);
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		
		convertIntToString();
	}

}
