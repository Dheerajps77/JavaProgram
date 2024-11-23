package Aug2024;

import java.util.Random;

public class RandomString {

	public static void generateRandomString()
	{
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder builder=null;
        Random random;
		try {
			builder=new StringBuilder();
			random=new Random();
			for(int i=0;i<20;i++)
			{
				int length=random.nextInt(characters.length());
				builder.append(characters.charAt(length));
			}
			System.out.println(builder.toString() + "@gmail.com");
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		generateRandomString();
	}
}
