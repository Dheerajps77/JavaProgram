package March2025;

public class InterviewQuestionsAnswerOn20March {

	public static void main(String[] args) {
		replaceThirdGood();
	}

	public static void replaceThirdGood() {
		try {
			String str = "GoodmorningGoodafternoonGoodnight";
			String wordToBeReplaced = "Bad";
			String findWord = "Good";

			int count = 0;
			StringBuilder newString = new StringBuilder();

			for (int i = 0; i < str.length(); i++) {
				// Check if substring matches "Good"
	            if (i <= str.length() - findWord.length() && str.substring(i, i + findWord.length()).equals(findWord)) {
					count++;
					// Replace only on the 3rd occurrence
					if (count == 3) {
						newString.append(wordToBeReplaced);
					} else {
						newString.append(findWord);
					}
					i = i + findWord.length() - 1; // Move index ahead after "Good"
				} else {
					newString.append(str.charAt(i));
				}
			}

			System.out.println(newString.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
