	package SomeMoreJavaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StringDescendingOrder {

	enum Cars {
		Lambo, Aston_Martin;
	}
	
	public static void wordsRev()
	{
		try {
			
			String str = "Hello guys. How are you ?";
			String str3="";
			String str1[]=str.split(" ");
			for(int i=0;i<str1.length;i++)
			{
				if(i==str1.length-1)
				{
					str3=str1[i]+str3;
				}
				else
				{
					str3=" "+ str1[i]+str3;
				}				
			}
			System.out.println(str3);
			
		} catch (Exception e) {
			throw e;
		}
		/*
		 Output :
		 ? you are How guys. Hello
		 */
	}

	public static ArrayList<String> listOfStrings() {
		String str = "Hello guys. How are you ?";
		ArrayList<String> arraylist = new ArrayList<String>();
		try {
			String str1[] = str.split(" ");
			int n = str1.length;

			for (int i = 0; i < n; i++) {
				arraylist.add(str1[i]);
			}

		} catch (Exception e) {
			throw e;
		}
		return arraylist;
	}

	public static void stringDescOrder() {

		ArrayList<String> arraylist = new ArrayList<String>();
		try {
			arraylist = listOfStrings();
			System.out.println("Before desc order : ");

			Iterator<String> iterator1 = arraylist.iterator();
			while (iterator1.hasNext()) {
				String str = iterator1.next();
				System.out.print(str + " ");
			}
			Collections.sort(arraylist, Collections.reverseOrder());
			System.out.println("After desc order : ");
			Iterator<String> iterator = arraylist.iterator();

			while (iterator.hasNext()) {
				String str = iterator.next();
				System.out.print(str + " ");
			}

		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {

		wordsRev();

	}

}
