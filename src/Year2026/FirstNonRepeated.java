package Year2026;

public class FirstNonRepeated {

	public static void firstNonRepeatedChar() {
		try {
			String str = "swiss", str1="f2a3d1e4";
			char[] charArr = str.toCharArray();
			for (int i = 0; i < charArr.length; i++) {
				int temp = 0;
				for (int j = 0; j < charArr.length; j++) {
					if (charArr[i] == charArr[j]) {
						temp++;
					}
				}
				if (temp == 1) {
					System.out.println("First non repeated char: " + charArr[i]);
					break;
				}
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void lastNonRepeatedChar() {
		try {
			
			String str="swiss";
			char[] charrArr = str.toCharArray();
			char lastChar='\0';
			for(int i=0;i<charrArr.length;i++)
			{				
				int temp=0;
				for(int j=0;j<charrArr.length;j++)
				{
					if(charrArr[i]==charrArr[j])
					{
						temp++;
					}
				}
				if(temp==1)
				{
					lastChar=charrArr[i];
				}
			}
			System.out.println("The last non-repeated char : " + lastChar);
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		lastNonRepeatedChar();
	}
}
