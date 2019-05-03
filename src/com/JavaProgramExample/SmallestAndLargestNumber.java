package com.JavaProgramExample;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {

		CheckSmallestAndLargestNumber();

	}

	public static void CheckFibnoacciNumber() {
		try {
			int i=0;
			int j=1;
			
			
			for(int l=0;l<10;l++)
			{
				System.out.println(i);
				int k=i+j;
				i=j;
				j=k;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void CheckSmallestAndLargestNumber() {
		try {
			int n[] = { 4, 3, 8, 676, 10, 43, 7, 45, 67, 9, 2 };
			int smallest= n[0];
			int largest=n[0];
						
			for(int i=0;i<n.length;i++)
			{
				if(n[i]<smallest)
				{
					smallest=n[i];
				}
				if(n[i]>largest)
				{
					largest=n[i];
				}
			}
			System.out.println("Smallest number is : "+ smallest);
			System.out.println("Largest number is : "+ largest);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
