package Aug2024;

import java.util.Scanner;

public class CharPrintBasisOnNumberCount {

	private static Scanner scanner;

	public static void userSpecificValue() {
		try {
			scanner = new Scanner(System.in);
			System.out.println("Please enter value");
			String userSpecificValue=scanner.next();
			
			char[] charArray=userSpecificValue.toCharArray();
			char newChaValue='\0';
			int repeatedCount=0;
			
			for(int i=0;i<charArray.length;i++)
			{
				if((charArray[i]>='A' && charArray[i] <='Z') || (charArray[i]>='a' && charArray[i]<='z'))
				{
					if(repeatedCount>0 && charArray[i] != '\0')
					{
						for(int j=0;j<repeatedCount;j++)
						{
							System.out.print(newChaValue);
						}
						System.out.print(" => char have count is : " + repeatedCount);
						System.out.println();
						repeatedCount = 0;
					}
					newChaValue=charArray[i];
				}
				else if(charArray[i]>='0' && charArray[i]<='9')
				{
					int value=repeatedCount * 10;
					int actualVaue=charArray[i]-'0';
					repeatedCount=value + actualVaue;
				}
			}
			if(repeatedCount>0 && newChaValue != '\0')
			{
				for(int j=0;j<repeatedCount;j++)
				{
					System.out.print(" => char have count is : " + newChaValue);
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			throw e;
		}
	}

	public static void PrintBasisOnNumberCount() {
		try {

			String str = "f4m3b5i2l9b1";
			char[] charArray = str.toCharArray();
			int repeatCount = 0;
			char newCharValue = '\0';
			for (int i = 0; i < charArray.length; i++) {
				if ((charArray[i] >= 'A' && charArray[i] <= 'Z') || (charArray[i] >= 'a' && charArray[i] <= 'z')) {
					if (repeatCount > 0 && newCharValue != '\0') {
						for (int j = 0; j < repeatCount; j++) {
							System.out.print(newCharValue);
						}
						repeatCount = 0;
						System.out.println();
					}
					newCharValue = charArray[i];
				} else if (charArray[i] >= '0' && charArray[i] <= '9') {
					int value = repeatCount * 10;
					int actualCount = charArray[i] - '0';
					repeatCount = value + actualCount;
				}
			}
			// Handle the last letter and its repeat count

			if (repeatCount > 0 && newCharValue != '\0') {
				for (int j = 0; j < repeatCount; j++) {
					System.out.print(newCharValue);
				}
				System.out.println();
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		userSpecificValue();
	}

}
