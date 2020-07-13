package Program30June;

public class PlayingWithASCIICode {
	
	
	public static void toGetASCIICodeOfParticularCharacters()
	{
		String str="Hello guys. How are you doing all ?? ";
		try {
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
				int n=c;
				System.out.println(n);
			}			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void toGetASCIICharacterOfParticularNumber()
	{
		
		int[] n={97,99,55,67,87,98,23,56,77,89};
		try {
			
			for(int i=0;i<n.length;i++)
			{
				int n1=n[i];
				char c=(char) n1;
				System.out.println(c);
			}
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		
		toGetASCIICharacterOfParticularNumber();
	}

}
