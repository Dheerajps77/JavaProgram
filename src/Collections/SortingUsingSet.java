package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingUsingSet {
	
	public static void main(String[] args) {
			
		Set<Integer> value=new HashSet<>();
		value.add(1);
		value.add(2);
		value.add(9);
		value.add(1);
		value.add(2);
		value.add(3);
		value.add(1);
		value.add(4);
		value.add(1);
		value.add(5);
		value.add(7);
		
		List<Integer> value1=new ArrayList<Integer>(value);
		
		/*for(int i=0;i<value1.size();i++)
		{
			value1.addAll(value);
		}
		*/
		
		Collections.sort(value1);
		System.out.println(value1);
		/*for(int i=0;i<value1.size();i++)
		{
			for(int j=i+1;j<value.size();j++)
			{
				if(value1[i]>value1[j])
				{
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}				
			}
			System.out.println(n[i]);
		}*/
	}

}
