package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FinalKeword {

	public static void main(String[] args) {
		
		final int n=10;
        List<String> list=new ArrayList<String>();
		list.add("a");
		list.remove("a");
		list.add("a1");
		System.out.println(n);
		Iterator<String> iterator=list.iterator();
		while (iterator.hasNext()) {
			String string=iterator.next();
			System.out.println(string);
			
		}
	}
}
