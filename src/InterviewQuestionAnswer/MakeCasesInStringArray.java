package InterviewQuestionAnswer;

public class MakeCasesInStringArray {

	public static void makeUpperCaseInStringArray() {
		try {

			String[] str = { "John", "Jane", "Jack", "Doe" };
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < str.length; i++) {
				for (int j = 0; j < str[i].length(); j++) {
					char ch = str[i].charAt(j);

					if ((ch >= 'a' && ch <= 'z')) {
						builder.append((char) (ch - 32));
					} else {
						builder.append(ch);
					}
				}
				builder.append(' ');
			}

			System.out.println(builder.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void shiftLowerCaseCharInLeftAndUpperCaseCharInRight() {
		try {

			char[] charArray = { 'a', 'B', 'c', 'D', 'e', 'F', 'g', 'H' };
			int temp = 0;
			for (int i = 0; i < charArray.length; i++) {

				if (charArray[i] >= 'a' && charArray[i] <= 'z') {
					charArray[temp++] = charArray[i];
				}
			}

			for (int i = 0; i < charArray.length; i++) {

				if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
					charArray[temp++] = charArray[i];
				}
			}

			for (int j = 0; j < temp; j++) {
				System.out.print(charArray[j]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void convertBasisOnIndexInCharArray() {
		try {

			char[] charArray = { 'a', 'B', 'c', 'D', 'e', 'F', 'g', 'H', 'm', 'N', 'o', 'P', 'q', 'R', 's', 'T' };
			int temp = 0;
			for (int i = 0; i < charArray.length; i++) {
	            // Convert even index characters to uppercase
	            if (i % 2 == 0) {
	                if (charArray[i] >= 'a' && charArray[i] <= 'z') {
	                    charArray[i] = (char) (charArray[i] - 32);  // Convert to uppercase
	                }
	            }
	            // Convert odd index characters to lowercase
	            else {
	                if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
	                    charArray[i] = (char) (charArray[i] + 32);  // Convert to lowercase
	                }
	            }
	        }

			for (int j = 0; j < charArray.length; j++) {
				System.out.print(charArray[j] + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//shiftLowerCaseCharInLeftAndUpperCaseCharInRight(); // acegBDFH
		// makeUpperCaseInStringArray(); //JOHN JANE JACK DOE
		convertBasisOnIndexInCharArray(); // A b C d E f G h M n O p Q r S t 
	}

}
