package Collections;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {
	
	
	public static void WithoutComp()
	{
		try {
			int[]n={3,5,6,1,22,1,12,7,8,9,10,4};
			System.out.println("Before sort : ");
			for(int i=0;i<n.length;i++)
			{
				System.out.println(n[i]);
			}
			
			System.out.println("After sort : ");
			for(int i=0;i<n.length;i++)
			{
				Arrays.sort(n);
				System.out.println(n[i]);
			}
			
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		WithoutComp();
	}

}
