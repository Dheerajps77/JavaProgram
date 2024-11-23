package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class SubsFromEachValueFromArray {

	public static void subsFromArray() {
		try {

			int n[] = { 67, 44, 22, 77, 988, 88, 6, 4, 3, 32 };
			int temp = 1;
			int subsNumber;

			ArrayList<Integer> arraylist = new ArrayList<Integer>();

			for (int i = 0; i < n.length; i++) {
				subsNumber = n[i] - temp;
				arraylist.add(subsNumber);
			}

			Iterator<Integer> iterator = arraylist.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {

		subsFromArray();

	}

}
