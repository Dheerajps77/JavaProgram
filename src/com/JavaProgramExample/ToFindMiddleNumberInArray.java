package com.JavaProgramExample;

import java.util.ArrayList;

public class ToFindMiddleNumberInArray {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(12);
		arraylist.add(35);
		arraylist.add(23);		
		arraylist.add(11);
		
		arraylist.add(21);
		
		arraylist.add(78);
		arraylist.add(15);
		arraylist.add(55);
		arraylist.add(54);
		arraylist.add(53);
		int value=0;
		for(int i=0;i<arraylist.size();i++)
		{
			value=arraylist.get((arraylist.size()/2));
		}
		System.out.println(value);
		
	}

}
