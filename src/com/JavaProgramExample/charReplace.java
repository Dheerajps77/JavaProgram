package com.JavaProgramExample;

public class charReplace {
	
	
	public static void charReplaceInString()
	{
		StringBuilder sb=new StringBuilder();
		try {
			
			String str="Hello guyse";
			char[]c=str.toCharArray();
			
			for(int i=0;i<c.length;i++)
			{
				if(c[i]=='l')
				{
				sb.append(c[i]).append('g');
				//sb.append(c[i]);
				}
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		charReplaceInString();
		
	}

}
