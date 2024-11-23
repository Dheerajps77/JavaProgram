package com.JavaProgramExample;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int n=153;
		CheckArmStrongNumber(n);
	}

	// ArmStrongNumber is Where the sum of multiplication of each number is equal the number(1*1*1+5*5*5+3*3*3=153)
	public static void CheckArmStrongNumber(int number) {
		try {
			int temp, reminder, sum=0;
			temp=number;
			
			while(number>0)
			{
			reminder=number%10;
			number=number/10;
			sum=sum+reminder*reminder*reminder;
			}
			System.out.println(sum);
			
			if(sum==temp)
			{
				System.out.println("This is armstrong number : "+sum);
			}
			else
			{
				System.out.println("This is not armstrong number : "+sum);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
	}

}
