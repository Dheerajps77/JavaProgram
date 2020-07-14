package Program30June;

import java.util.ArrayList;
import java.util.Iterator;

public class IntersectionOfTwoArrays {
	
	public static void toGetTheIntersectionOfTwoArrays()
	{
		try {
			int array1[] ={1,4,7, 9, 2};
			int array2[]={1,7,3,4,5, 2};
			ArrayList<Integer> arrayListOfIntersectionOfTwoArrays=new ArrayList<Integer>();
			
			System.out.println("First array1 numbers are at below");
			for(int h=0;h<array1.length;h++)
			{
				System.out.print(array1[h] + " ");
			}			
			System.out.println();
			
			System.out.println("Second array2 numbers are at below");
			for(int d=0;d<array2.length;d++)
			{
				System.out.print(array2[d] + " ");
			}
			System.out.println();
			
			for(int i=0;i<array1.length;i++)
			{
				for(int j=0;j<array2.length;j++)
				{
					if(array1[i]==array2[j])
					{
						arrayListOfIntersectionOfTwoArrays.add(array2[j]);
					}
				}
			}
			System.out.println();
			System.out.println("Below are the intersection points of two arrays at below");
			Iterator<Integer> arrayList=arrayListOfIntersectionOfTwoArrays.iterator();			
			while(arrayList.hasNext())
			{
				int num=arrayList.next();
				System.out.print(num + " ");
			}
			
		} catch (Exception e) {
			throw e;
		}
		
/***
OutPut : 
First array1 numbers are at below
1 4 7 9 2 
Second array2 numbers are at below
1 7 3 4 5 2 

Below are the intersection points of two arrays at below
1 4 7 2 
*/
	}
	public static void main(String[] args) {
		
		toGetTheIntersectionOfTwoArrays();
	}

}
