package Collections;

import java.util.Scanner;

public class UserAskedNumberToPrintFact {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to print for factorials");
		int number=sc.nextInt();
		
		int []n1=new int[number];
		int fact=1;
		for(int i=1;i<=n1.length;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
