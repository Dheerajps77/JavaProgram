package Program30June;

public class PlayingWithASCIICode {

	public static void toGetASCIICodeOfParticularCharacters() {
		String str = "Hello guys. How are you doing all ?? ";
		try {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				int n = c;
				System.out.println(n);
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void toGetASCIICharacterOfParticularNumber() {

		int[] n = { 97, 99, 55, 67, 87, 98, 23, 56, 77, 89 };
		try {

			for (int i = 0; i < n.length; i++) {
				int n1 = n[i];
				char c = (char) n1;
				System.out.println(c);
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void checkIfNumberInString() {
		try {

			String str = "Dheeraj345555Pratap 444Singh";

			char[] char1 = str.toCharArray();

			for (int i = 0; i < char1.length; i++) {
				if (char1[i] >= '0' && char1[i] <= '9' && char1[i] != ' ') {
					System.out.println("This is " + char1[i] + " number present in string");
				} else {
					System.out.println("This is " + char1[i] + " present in string");
				}
			}

		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void replaceLowerToUpperAndViceVersa()
	{
		try {
			
			String str="DHeeraj PRATAP SinGH";
			char c1=' ', c2=' ';
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)>=64 &&str.charAt(i)<=91)
				{
					c1=(char) (str.charAt(i)+32);
					System.out.print(c1);
				}
				else if((str.charAt(i)>=96 &&str.charAt(i)<=122))
				{
					c2 = (char) (str.charAt(i)-32);
					System.out.print(c2);
				}
			}
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void replaceStringInplaceofSpace()
	{
		try {
			
			String str="Dhe Pratap S ingh";
			
			char c[]=str.toCharArray();
			
			for(int i=0;i<c.length;i++)
			{
				if(c[i]== ' ')
				{
					c[i]= 'H';
				}
				System.out.print(c[i]);
			}
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void seperateStringFromEachOther()
	{
		try {
			
			String str="Dheeraj";
			StringBuilder sb=new StringBuilder();
			char[] c=str.toCharArray();
			for(int i=0;i<str.length();i++)
			{
				System.out.print(str.charAt(i)+" ");
				//sb.append(c[i]).append(' ');
			}
			
			//System.out.println(sb.toString());
			
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {

		seperateStringFromEachOther();
	}

}
