package com.JavaProgramExample;

public class GenerateRandomString {
	
	
	public static String RandomString(String str)
	{
		StringBuffer stringbuffer = null;
		try {
			
			stringbuffer=new StringBuffer(10);
			
			for(int i=0;i<10;i++)
			{
				int index=(int)(str.length()*Math.random());
				stringbuffer.append(str.charAt(index));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stringbuffer.toString()+"@gmail.com";
	}
	
	public static void main(String[] args) {
		
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
		String str1=RandomString(str);
		System.out.println(str1);
		
	}

}
