package com.JavaProgramExample;

import java.util.Arrays;

public class MedianOfArray {

	public static void main(String[] args) {
		 
	      int scores[] = new int[] {20, 98, 76, 89, 99, 75, 83, 91, 45, 78, 67, 88};
	 
	      Arrays.sort(scores);
	      System.out.print("Sorted Scores: ");
	      for (int x : scores) {
	        System.out.print(x + " ");
	      }
	      System.out.println("");
	 
	      // Calculate median (middle number)
	      double median = 0;
	      double pos1 = Math.floor((scores.length - 1.0) / 2.0);
	      double pos2 = Math.ceil((scores.length - 1.0) / 2.0);
	      if (pos1 == pos2 ) {
	         median = scores[(int)pos1];
	      } else {
	         median = (scores[(int)pos1] + scores[(int)pos2]) / 2.0 ;
	      }
	 
	      System.out.println("Median: " + median);
	 
	   }
}
