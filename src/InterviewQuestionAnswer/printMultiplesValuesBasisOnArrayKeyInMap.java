package InterviewQuestionAnswer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class printMultiplesValuesBasisOnArrayKeyInMap {

	String name;
	String desg;
	int empId;

	public printMultiplesValuesBasisOnArrayKeyInMap(String name, String desg, int empId) {
		this.name = name;
		this.desg = desg;
		this.empId = empId;
	}

	public String toString() {
		return name + " : " + desg + " : " + empId;
	}

	public static void printKeyValuePairFromMethod(Map<Integer, printMultiplesValuesBasisOnArrayKeyInMap> map) {
		try {
			Set<Entry<Integer, printMultiplesValuesBasisOnArrayKeyInMap>> valueOfMap = map.entrySet();
			for (Map.Entry<Integer, printMultiplesValuesBasisOnArrayKeyInMap> value : valueOfMap) {
				System.out.println(value.getKey() + " : " + value.getValue());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows of employee details in Map");
		Map<Integer, printMultiplesValuesBasisOnArrayKeyInMap> maps = new HashMap<Integer, printMultiplesValuesBasisOnArrayKeyInMap>();
		int rows = scanner.nextInt();
		printMultiplesValuesBasisOnArrayKeyInMap[] arrayofMaps = new printMultiplesValuesBasisOnArrayKeyInMap[rows];

		for (int i = 0; i < rows; i++) {
			System.out.println("Enter name, designation followed by empId : " + (i + 1));
			String name = scanner.next();
			String desg = scanner.next();
			int empId = scanner.nextInt();
			arrayofMaps[i] = new printMultiplesValuesBasisOnArrayKeyInMap(name, desg, empId);
			maps.put(101 + i, arrayofMaps[i]);
		}
		printKeyValuePairFromMethod(maps);
		scanner.close();
	}

}
