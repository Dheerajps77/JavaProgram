package com.JavaProgramExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	
	//static String string2="Harish45858";
	
	public static void main(String[] args) {
		int i=0;
		//String string1=new String("Harish");
		String string2="Harish4585836482&**(*(*(";
		String string=null;
		System.out.println(string);
		
		  Pattern pattern=Pattern.compile("\\W"); Matcher
		  matcher=pattern.matcher(string2); 
		  
		  while(matcher.find()) {
			 i++;
		  System.out.println(matcher.group()); 
		  }
        System.out.println(i);
		 
		 
		
		
		/*String str2;
		str2=string2.replaceAll("[0-9]", "");
		System.out.println(str2);*/
	}

}
