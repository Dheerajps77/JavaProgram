package Program30June;

public class Vowels {

	public static void vowelsCount() {
		try {

			String abc = "abcdefghijklmnopqrstuvwxyz";

			char a = 'a';
			char e = 'e';
			char i = 'i';
			char o = 'o';
			char u = 'u';

			int temp = 0;

			char[] vowels = abc.toCharArray();
			//int n=vowels.length;
			//System.out.println(n);
			for (int h = 0; h < vowels.length; h++) {
				 
				//System.out.println(vowels[h]);
				
				if ((vowels[h] == a) || (vowels[h] == e) || (vowels[h] == i) || (vowels[h] == o) || (vowels[h] == u)) {
					temp++;
				}
			}

			System.out.println("Total number of vowels count is : " + temp);

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		vowelsCount();
	}

}
