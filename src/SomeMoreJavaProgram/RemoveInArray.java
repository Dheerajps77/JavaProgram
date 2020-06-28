package SomeMoreJavaProgram;

import java.util.ArrayList;

public class RemoveInArray {
	
	
	public static void removeFirstNumberInArray()
	{
		int n[]={10,33,35,65,3,24};
		ArrayList<Integer> arrays=new ArrayList<>();
		try {
			
			System.out.println("Output before removing first number");
			for(int i=0;i<n.length;i++)
			{
				System.out.println(n[i]);
				arrays.add(n[i]);
			}
						
			for(int i=0;i<arrays.size();)
			{
				arrays.remove(i);
				break;
			}
			
			System.out.println("Output after removing first number");
			for(int i=0;i<arrays.size();i++)
			{
				System.out.println(arrays.get(i));
			}
			
		} catch (Exception e) {
			throw e;
		}
		
/***
Output before removing first number
10
33
35
65
3
24
Output after removing first number
33
35
65
3
24
*/
	}
	
	public static void removeLastNumberInArray()
	{
		int n[]={10,33,35,65,3,24};
		ArrayList<Integer> arrays=new ArrayList<>();
		try {
			
			System.out.println("Output before removing last number");
			for(int i=0;i<n.length;i++)
			{
				System.out.println(n[i]);
				arrays.add(n[i]);
			}
						
			for(int i=arrays.size()-1;i>=0;)
			{
				arrays.remove(i);
				break;
			}
			
			System.out.println("Output after removing first number");
			for(int i=0;i<arrays.size();i++)
			{
				System.out.println(arrays.get(i));
			}
			
		} catch (Exception e) {
			throw e;
		}
		
/***
Output before removing last number
10
33
35
65
3
24
Output after removing first number
10
33
35
65
3
*/
	}
	public static void main(String[] args) {
		
		removeFirstNumberInArray();
	}

}
