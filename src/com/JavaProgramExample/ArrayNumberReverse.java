package com.JavaProgramExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayNumberReverse {
	
	
	
	public static void ReverseArrayNumber()
	{
		try {
			
			int[] num= {44,55,33,5,56,77,6,12,4,56,78};
			
			ArrayList<Integer> arrayList=new ArrayList<Integer>();
			System.out.println("Below are number before reverse :-");
			for(int i=0;i<num.length;i++)
			{
				System.out.println(num[i]);
			}
			for(int i=num.length-1;i>=0;i--)
			{
				arrayList.add(num[i]);
			}
			
			Iterator<Integer> iterator=arrayList.iterator();
			System.out.println("Below are the reversed array number :-");
			while(iterator.hasNext())
			{
				int reversedArrayNumber=iterator.next();				
				System.out.println(reversedArrayNumber);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
/*
Output
Below are number before reverse :-
44
55
33
5
56
77
6
12
4
56
78
Below are the reversed array number :-
78
56
4
12
6
77
56
5
33
55
44 		  
*/
	}
	
	public static void ReverseArrayString()
	{
		try {
			
			String[] str= {"Hi", "Hello", "Bye", "Come on", "Shit", "Say it again !!"};
			ArrayList<String> arrayList=new ArrayList<String>();
			System.out.println("Below are strings before reverse :-");
			for(int i=0;i<str.length;i++)
			{
				System.out.println(str[i]);
			}
			
			for(int i=str.length-1;i>=0;i--)
			{
				arrayList.add(str[i]);
			}
			
			Iterator<String> iterator=arrayList.iterator();
			System.out.println("Below are the reversed array strings :-");
			while(iterator.hasNext())
			{
				String strIterator=iterator.next();
				System.out.println(strIterator);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//OutPut :-
		
		/*
		Below are strings before reverse :-
		Hi
		Hello
		Bye
		Come on
		Shit
		Say it again !!
		Below are the reversed array strings :-
		Say it again !!
		Shit
		Come on
		Bye
		Hello
		Hi
		*/
	}
	
	public static void main(String[] args) {
		ReverseArrayNumber();
		
	}

}
