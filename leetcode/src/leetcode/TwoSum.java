package leetcode;

import java.util.Arrays;

public class TwoSum {
	// makes do
	/*
	 * public static void main(String[] args) { int nums[] = { 0, 2,7, 1, 5, 3,
	 * 4,11,15}; int target = 9; for (int i = 0; i < nums.length - 1; i++) { int
	 * sum; if (nums[i + 1] == nums.length) { System.out.println("do noth");
	 * continue;
	 * 
	 * } else { sum = nums[i] + nums[i + 1]; // System.out.println("else"+sum); if
	 * (sum == target) { System.out.println("indexies: [" + i +","+ (i + 1)+"]"); }
	 * }
	 * 
	 * } }
	 */
	// Using for loop
	/*
	 * public static void main(String[] args) { // int nums[] = { 0, 2,7, 1, 5, 3,
	 * 4,11,15}; int nums[] = {3,2,4}; int target = 6; for (int i = 0; i <=
	 * nums.length-1; i++) { for (int j = i+1; j <= nums.length-1; j++) {
	 * if((nums[i]+nums[j])==target) { System.out.println("print"+i+j); } }
	 * 
	 * } }
	 */

	// making function
	public static int[] sum() {
		// int nums[] = { 0, 2, 7, 1, 5, 3, 4, 11, 15 };
		int nums[] = { 3, 2, 4 };
		int target = 6;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) { //
					System.out.println("print" + i + j);
					int a[] = { j, i };
					return a;
				}
			}
		}
		return null;

	}

	public static void main(String[] args) {
		int[] s = sum();
		System.out.println(Arrays.toString(s));
	}

}