package July2025;

public class ArrayCompare {

	public static void sortingOfIntArray(int[] arrays) {
		int temp = 0;
		try {
			for (int i = 0; i < arrays.length - 1; i++) {
				for (int j = i + 1; j < arrays.length; j++) {
					if (arrays[i] > arrays[j]) {
						temp = arrays[i];
						arrays[i] = arrays[j];
						arrays[j] = temp;
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sortingOfStringArray(String[] strArr) {
		String temp = "";
		for (int i = 0; i < strArr.length - 1; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i].compareTo(strArr[j]) > 0) {
					temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}
	}
	
	public static void sortingOfCharArray(char[] charArr)
	{
		char temp=' ';
		for(int i=0;i<charArr.length;i++)
		{
			for(int j=i+1;j<charArr.length;j++)
			{
				if(charArr[i]>charArr[j])
				{
					temp=charArr[i];
					charArr[i]=charArr[j];
					charArr[j]=temp;
				}
			}
		}
	}

	public static boolean compareIntValue() {
		try {

			int n[] = { 2, 61, 4, 3, 21, 5, 9, 7, 6, 45, 1 };
			int n1[] = { 2, 61, 4, 3, 21, 5, 9, 7, 6, 45, 1 }; // return true as All value are match
			// int n1[] = { 2, 61, 4, 3, 21, 5, 9, 21, 88, 45, 1 }; // return false as All
			// value are not match

			if (n.length != n1.length)
				return false;

			sortingOfIntArray(n);
			sortingOfIntArray(n1);

			for (int i = 0; i < n.length; i++) {
				if (n[i] != n1[i])
					return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public static boolean compareStringValue() {
		try {

			String n[] = { "Dheeraj", "Neha", "Rahul", "Anant"};
			String n1[] = { "Dheeraj", "Neha", "Rahul", "Anant"}; // return true as All value are match
			// String n1[] = { "Dheeraj", "Neha", "sahul", "Anant"}; // return false as All
			// value are not match

			if (n.length != n1.length)
				return false;

			sortingOfStringArray(n);
			sortingOfStringArray(n1);

			for (int i = 0; i < n.length; i++) {
				if (!n[i].equals(n1[i]))
					return false;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public static boolean compareCharValue()
	{
		try {
			char[] charArr = {'d','f','g','r','a','y','b'};
			char[] charArr1 = {'d','f','g','r','a','y','b'};// return true as All value are match
			// char[] charArr1 = {'d','i','g','r','a','y','b'}; // return false as All
			// value are not match
			
			if(charArr.length != charArr1.length)
				return false;
			
			sortingOfCharArray(charArr);
			sortingOfCharArray(charArr1);
			
			for(int i=0;i<charArr.length;i++)
			{
				if(charArr[i]!=charArr1[i])
					return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}


	public static void main(String[] args) {
		//System.out.println("Number in arrays are equal : " + compareIntValue());
		//System.out.println("Words in arrays are equal : " + compareStringValue());
		System.out.println("Char in arrays are equal : " + compareCharValue());
	}

}
