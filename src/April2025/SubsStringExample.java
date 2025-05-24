package April2025;

public class SubsStringExample {

	
	/*
	 The substring() method in Java is used to extract a portion of a string — i.e., 
	 a sub-part of the original string.
	 
	 1. str.substring(beginIndex)
		Returns a substring from beginIndex to the end of the string.

	 2. str.substring(beginIndex, endIndex)
		Returns a substring from beginIndex to (endIndex - 1)
		
	Indexing starts at 0
	beginIndex must be >= 0
	endIndex must be <= string length
	beginIndex < endIndex, otherwise it throws StringIndexOutOfBoundsException
	
	The terms inclusive and exclusive are very important when working with ranges, 
	indexes, or loops — especially with substring() in Java
	
	beginIndex → Inclusive (starts from this index and includes the character)
	endIndex → Exclusive (does not include the character at this index)


	 */
	public static void substringMethod1()
	{
		String s="hello";    
		System.out.println(s.substring(0,2)); //he
		
		
		String str = "banana";
		String result = str.substring(1, 4);
		System.out.println(result);  // Output: "ana"
		
		/*
		 Index:        0 1 2 3 4 5
		 Characters:   b a n a n a
              		   ↑ ↑ ↑
              		   1 2 3
              		   
         beginIndex = 1 → includes 'a'
		 endIndex = 4 → excludes character at index 4 (which is 'n')
		 
		 🧠 Think of it like this:
			Inclusive → "Include me"
			Exclusive → "Exclude me"
		 */
		
		String date = "2025-05-24";
		System.out.println(date.substring(0, 4)); // includes index 0 to 3 → "2025"
	}
	public static void main(String[] args) {
		substringMethod1();
	}

}
