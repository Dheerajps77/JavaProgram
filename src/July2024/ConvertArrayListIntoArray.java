package July2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertArrayListIntoArray {

	public static void convertIntoArray() {
		try {

			List<String> arrList = new ArrayList<String>();

			Collections.addAll(arrList, "hello", "By", "Shye", "ladki", "No");
			String[] str = new String[arrList.size()];
			String[] newString = arrList.toArray(str);

		} catch (Exception e) {
			throw e;
		}
	}

}
