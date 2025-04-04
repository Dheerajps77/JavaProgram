package March2025;

public class ReverseOnlyWordsInString {
	
	public static void main(String[] args) {
		reverseWordAndKeepSpecialInTheirPlace();
		
		// yM eman si jareehd patarp hgniS
	}

	public static void reverseWordWithDifferentApproach()
	{
		try {
			String str = "My name is dheeraj pratap Singh";
			String[] strArr=str.split(" ");
			
			for(int i=0;i<strArr.length;i++)
			{
				char[] charArr=strArr[i].toCharArray();
				
				for(int j=charArr.length-1;j>=0;j--)
				{
					System.out.print(charArr[j]);
				}
			System.out.print(" ");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void reverseWordAndKeepSpecialInTheirPlace() {
		try {
			String str = "as&^hg@$vb";
			System.out.println("Original Word : " + str);
			char[] arr = str.toCharArray();
		    int i = 0, j = arr.length - 1;
		    while (i < j) {
	            if (!((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z'))) {
		        	i++;
	            }
	            else if (!((arr[j] >= 'a' && arr[j] <= 'z') || (arr[j] >= 'A' && arr[j] <= 'Z'))) {
	                j--;
	            }
	            else {
	                char temp = arr[i];
	                arr[i++] = arr[j];
	                arr[j--] = temp;
	            }
		    }

		    String result=new String(arr);
		    System.out.println("Reversed Word except special: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
