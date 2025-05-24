package April2025;

public class StirngMethodsAndProblems {

	public static void indexOfString()
	{	
		String str = "realme BMPS 2025";
		
		/*
		indexOf() — First Occurrence (Left to Right)
		
		Finds the index of the first occurrence of a character or substring, 
		searching from the start of the string.

		
		Index:        0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		Characters:   r e a l m e   B M P  S     2  0  2  5
		 */
				
		System.out.println(str.indexOf('B')); // 7
		System.out.println(str.indexOf('5')); // 15
		System.out.println(str.indexOf('Z')); // -1 // if no values found on particular index
		
		
		System.out.println(str.indexOf("2025")); // 12
		System.out.println(str.indexOf("2026")); // -1 // if no values found on particular index
		
		
		//System.out.println(str.indexOf);
		
		String str1 = "HelloABCD52025Test";
		
		/*
		 Index:        0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
		 Characters:   H e l l o A B C D 5  2  0  2  5  T  e  s  t
		 */
		
		System.out.println(str1.indexOf('5', 10)); // 13
		System.out.println(str1.indexOf('5', 9)); // 9
		System.out.println(str1.indexOf('5', 8)); // 9
		
		System.out.println(str1.indexOf("25", 5)); // 12
		System.out.println(str1.indexOf("25", 19)); // -1
		
		/*
		 Index:        0 1 2 3 4 5 6 7 8 9 10
		 Characters:   a b r a c a d a b r a
		 */
		
		String s = "abracadabra";
		int index = s.indexOf("abra", 2);
		System.out.println(index); // Output: 7
	}
	
	public static void lastIndexOfString()
	{
		String str = "realme BMPS 2025";
		/*
		lastIndexOf() — Last Occurrence (Right to Left)
		
		Finds the index of the last occurrence of a character or substring, 
		searching backward from the end (or a specific index).		
		
		Index:        0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		Characters:   r e a l m e   B M P  S     2  0  2  5
		 */
		
		System.out.println("last index " + str.lastIndexOf('B')); // 7
		System.out.println("last index " + str.lastIndexOf('5')); // 15
		System.out.println("last index " + str.lastIndexOf('Z')); // -1 // if no values found on particular index
		
		
		String sentence = "one, two, one, two";
		System.out.println("last index " + sentence.lastIndexOf("one")); // 10
		System.out.println("last index " + sentence.indexOf("one")); // 0
		
		
		String word = "banana";
		int index1 = word.lastIndexOf('a', 4);
		System.out.println(index1); // 3
	}
	
	public static void main(String[] args) {
		lastIndexOfString();
	}
}
