package Program30June;

public class StringReplaceWithSpecificWords {

	public static void stringReplace(String str, String to, String from) {
		try {
			String[] strArray = str.split(from);
			StringBuffer sb = new StringBuffer();

			for (int i = 0; i < strArray.length; i++) {
				sb.append(strArray[i]).append(to);				
			}

			System.out.println(sb.toString());
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {

		String str = "Hello world, github world, java world, python world";
		stringReplace(str, "duniya ", "world");
	}
	
	/***
	 * OUtPut :
	 * Hello duniya , github duniya , java duniya , python duniya 

	 */

}
