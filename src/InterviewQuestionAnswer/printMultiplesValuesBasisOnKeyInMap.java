package InterviewQuestionAnswer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class printMultiplesValuesBasisOnKeyInMap {

	String name;
	String designation;
	int empID;

	public printMultiplesValuesBasisOnKeyInMap(String name, String designation, int empID) {
		this.name = name;
		this.designation = designation;
		this.empID = empID;
	}

	public String toString() {
		return name + " : " + designation + " : " + empID;
	}

	public static void printKeyAndValuePairThroughMap(Map<Integer, printMultiplesValuesBasisOnKeyInMap> map) {
		try {

			Set<Entry<Integer, printMultiplesValuesBasisOnKeyInMap>> entrySet = map.entrySet();

			for (Map.Entry<Integer, printMultiplesValuesBasisOnKeyInMap> value : entrySet) {
				System.out.println(value.getKey() + ", values -> " + value.getValue());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		printMultiplesValuesBasisOnKeyInMap basisOnKeyInMap = new printMultiplesValuesBasisOnKeyInMap("Dheeraj", "QA", 392023);
		printMultiplesValuesBasisOnKeyInMap basisOnKeyInMap1 = new printMultiplesValuesBasisOnKeyInMap("Rahul", "Developer", 849392);

		Map<Integer, printMultiplesValuesBasisOnKeyInMap> map = new HashMap<Integer, printMultiplesValuesBasisOnKeyInMap>();
		map.put(101, basisOnKeyInMap);
		map.put(102, basisOnKeyInMap1);
		printKeyAndValuePairThroughMap(map);

	}

}
