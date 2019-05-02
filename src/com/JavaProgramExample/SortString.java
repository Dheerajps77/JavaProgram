package com.JavaProgramExample;

public class SortString {
	
	public static void main(String[] args) {
		SortStringProgram();
	}
	
	public static void SortStringProgram()
	{
		String[] str={"Thanos", "Captain", "Tony Stark", "Thor","Barton", "Avengers"};
		int totalLength=str.length;
		String temp="";
		
		for(int i=0;i<totalLength;i++)
		{
			for(int j=i+1;j<totalLength;j++)
			{
				if(str[i].compareTo(str[j])>0)	
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
			System.out.println(str[i]);
		}
	}

}
