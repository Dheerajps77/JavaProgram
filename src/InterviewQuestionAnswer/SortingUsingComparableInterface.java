package InterviewQuestionAnswer;

import java.util.Arrays;

public class SortingUsingComparableInterface implements Comparable<SortingUsingComparableInterface> {

	String name;
	String desg;
	int empid;
	String city;

	public SortingUsingComparableInterface(String name, String desg, int empid, String city) {
		super();
		this.name = name;
		this.desg = desg;
		this.empid = empid;
		this.city = city;
	}

	@Override
	public int compareTo(SortingUsingComparableInterface o) {
		if (this.empid > o.empid) {
			return 1;
		} else if (this.empid == o.empid) {
			return 0;
		} else {
			return -1;
		}

	}

	public String toString() {
		return name + " : " + desg + " : " + empid + " : " + city;
	}

	public void data() {
		System.out.println(name + " : " + desg + " : " + empid + " : " + city);
	}

	public static void main(String[] args) {

		SortingUsingComparableInterface comparableInterface = new SortingUsingComparableInterface("Vineta", "QA", 1,
				"New Delhi");

		SortingUsingComparableInterface comparableInterface1 = new SortingUsingComparableInterface("Suneel",
				"Senior Vice Persident", 4, "Noida");

		SortingUsingComparableInterface comparableInterface2 = new SortingUsingComparableInterface("Ramu Verma",
				"QA Manager", 3, "Gurgaon");

		SortingUsingComparableInterface comparableInterface3 = new SortingUsingComparableInterface("Suneeta",
				"Senior Consultant", 2, "Uttra Pradesh");

		SortingUsingComparableInterface[] arrayOfs = { comparableInterface, comparableInterface1, comparableInterface2,
				comparableInterface3 };

		Arrays.sort(arrayOfs);
		
		for(SortingUsingComparableInterface objectOfs : arrayOfs)
		{
			objectOfs.data();
		}
	}

}
